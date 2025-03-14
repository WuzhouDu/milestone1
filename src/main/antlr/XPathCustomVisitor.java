package main.antlr;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XPathCustomVisitor extends XPathBaseVisitor<LinkedList<Node>> {
    private String fileName;
    private Document doc;
    private LinkedList<Node> tempResult = new LinkedList<>();
    private Boolean curCondRes = false;
    // context
    private HashMap<String, LinkedList<Node>> context = new HashMap<>();

    public XPathCustomVisitor(String fileName) {
        this.fileName = fileName;
    }

    // xq
    @Override
    public LinkedList<Node> visitXqVar(XPathParser.XqVarContext ctx) {
        String var = ctx.Var().getText();
        LinkedList<Node> result = context.get(var);
        return result;
    }

    @Override
    public LinkedList<Node> visitXqString(XPathParser.XqStringContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        String string = ctx.STRING().getText();
        string = string.substring(1, string.length() - 1);
        result.add(doc.createTextNode(string));
        return result;
    }

    @Override
    public LinkedList<Node> visitXqAp(XPathParser.XqApContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> res = visit(ctx.ap());
        context = snapShot;
        return res;
    }

    @Override
    public LinkedList<Node> visitXqParenthesized(XPathParser.XqParenthesizedContext ctx) {
        LinkedList<Node> res = visit(ctx.xq());
        return res;
    }

    @Override
    public LinkedList<Node> visitXqComma(XPathParser.XqCommaContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result1 = visit(ctx.xq(0));
        context = snapShot;
        LinkedList<Node> result2 = visit(ctx.xq(1));
        context = snapShot;
        result1.addAll(result2);
        return result1;
    }

    @Override
    public LinkedList<Node> visitXqSlash(XPathParser.XqSlashContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result = visit(ctx.xq());
        context = snapShot;
        tempResult = result;
        visit(ctx.rp());

        // eliminate the repeated nodes
        tempResult = new LinkedList<>(new LinkedHashSet<>(tempResult));
        // tempResult = new LinkedList<>(new HashSet<>(tempResult));
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitXqDoubleSlash(XPathParser.XqDoubleSlashContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result = visit(ctx.xq());
        tempResult = new LinkedList<>(new LinkedHashSet<>(result));
        // tempResult = new LinkedList<>(new HashSet<>(result));
        result = new LinkedList<>();
        context = snapShot;
        LinkedList<Node> queue = tempResult;
        while (!queue.isEmpty()) {
            visit(ctx.rp());
            result.addAll(tempResult);
            //result = new LinkedList<>(new HashSet<>(result));
            result = new LinkedList<>(new LinkedHashSet<>(result));
            LinkedList<Node> children = new LinkedList<>();
            for (Node node : queue) {
                int childCount = node.getChildNodes().getLength();
                for (int i = 0; i < childCount; i++) {
                    Node child = node.getChildNodes().item(i);
                    children.add(child);
                }
            }
            queue = children;
            tempResult = queue;
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitXqTag(XPathParser.XqTagContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> children = visit(ctx.xq());
        context = snapShot;
        LinkedList<Node> result = new LinkedList<>();
        Node resultNode = doc.createElement(ctx.tagName(0).getText());
        for (Node child : children) {
            // deep copy the child and import to the result node
            Node importedNode = resultNode.getOwnerDocument().importNode(child, true);
            resultNode.appendChild(importedNode);
        }
        result.add(resultNode);
        return result;
    }

    @Override
    public LinkedList<Node> visitXqForceLet(XPathParser.XqForceLetContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        for (int i = 0; i < ctx.forceLetClause().letBinding().size(); i++) {
            String var = ctx.forceLetClause().letBinding(i).Var().getText();
            HashMap<String, LinkedList<Node>> temp = new HashMap<>(context);
            LinkedList<Node> value = visit(ctx.forceLetClause().letBinding(i).xq());
            context = temp;
            context.put(var, value);
        }
        LinkedList<Node> result = visit(ctx.xq());
        context = snapShot;
        return result;
    }

    @Override
    public LinkedList<Node> visitXqFLWR(XPathParser.XqFLWRContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result = new LinkedList<>();

        // for clause
        LinkedList<HashMap<String, LinkedList<Node>>> forClauseRes = new LinkedList<HashMap<String, LinkedList<Node>>>();
        visitforClauseList(ctx.forClause().varBinding(), 0, forClauseRes);

        for (HashMap<String, LinkedList<Node>> tempContext : forClauseRes) {
            context = tempContext;
            // let clause
            if (ctx.letClause() != null) {
                for (int i = 0; i < ctx.letClause().letBinding().size(); i++) {
                    String var = ctx.letClause().letBinding(i).Var().getText();
                    HashMap<String, LinkedList<Node>> temp = new HashMap<>(context);
                    LinkedList<Node> value = visit(ctx.letClause().letBinding(i).xq());
                    context = temp;
                    context.put(var, value);
                }
            }
            // where clause
            HashMap<String, LinkedList<Node>> snapShotWhere = new HashMap<>(context);
            if (ctx.whereClause().cond() != null) {
                visit(ctx.whereClause().cond());
                context = snapShotWhere;
                if (curCondRes) {
                    // return clause
                    HashMap<String, LinkedList<Node>> snapShotReturn = new HashMap<>(context);
                    result.addAll(visit(ctx.returnClause().xq()));
                    context = snapShotReturn;
                }
            } else {
                // return clause
                HashMap<String, LinkedList<Node>> snapShotReturn = new HashMap<>(context);
                result.addAll(visit(ctx.returnClause().xq()));
                context = snapShotReturn;
            }
        }
        context = snapShot;
        return result;
    }

    // cond
    @Override
    public LinkedList<Node> visitCondEqSign(XPathParser.CondEqSignContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result1 = visit(ctx.xq(0));
        context = snapShot;
        LinkedList<Node> result2 = visit(ctx.xq(1));
        context = snapShot;
        Boolean isEqual = false;
        for (Node left : result1) {
            if (isEqual) {
                break;
            }
            for (Node right : result2) {
                if (left.isEqualNode(right)) {
                    isEqual = true;
                    break;
                }
            }
        }
        if (isEqual) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondEQ(XPathParser.CondEQContext ctx) {
        // the same as eq sign
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result1 = visit(ctx.xq(0));
        context = snapShot;
        LinkedList<Node> result2 = visit(ctx.xq(1));
        context = snapShot;
        Boolean isEqual = false;
        for (Node left : result1) {
            if (isEqual) {
                break;
            }
            for (Node right : result2) {
                if (left.isEqualNode(right)) {
                    isEqual = true;
                    break;
                }
            }
        }
        if (isEqual) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondDoubleEqual(XPathParser.CondDoubleEqualContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result1 = visit(ctx.xq(0));
        context = snapShot;
        LinkedList<Node> result2 = visit(ctx.xq(1));
        context = snapShot;
        Boolean isSame = false;
        for (Node left : result1) {
            if (isSame) {
                break;
            }
            for (Node right : result2) {
                if (left.isSameNode(right)) {
                    isSame = true;
                    break;
                }
            }
        }
        if (isSame) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondIs(XPathParser.CondIsContext ctx) {
        // the same as double equal
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result1 = visit(ctx.xq(0));
        context = snapShot;
        LinkedList<Node> result2 = visit(ctx.xq(1));
        context = snapShot;
        Boolean isSame = false;
        for (Node left : result1) {
            if (isSame) {
                break;
            }
            for (Node right : result2) {
                if (left.isSameNode(right)) {
                    isSame = true;
                    break;
                }
            }
        }
        if (isSame) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondEmpty(XPathParser.CondEmptyContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> result = visit(ctx.xq());
        context = snapShot;
        if (result.size() == 0) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondSome(XPathParser.CondSomeContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        // some clause list
        LinkedList<HashMap<String, LinkedList<Node>>> someClauseRes = new LinkedList<HashMap<String, LinkedList<Node>>>();
        visitSomeClauseList(ctx.varInXQ(), 0, someClauseRes);
        Boolean someRes = false;
        for (HashMap<String, LinkedList<Node>> tempContext : someClauseRes) {
            context = tempContext;
            HashMap<String, LinkedList<Node>> snapShotWhere = new HashMap<>(context);
            visit(ctx.cond());
            context = snapShotWhere;
            if (curCondRes) {
                someRes = true;
                break;
            }
        }
        context = snapShot;
        if (someRes) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondParenthesized(XPathParser.CondParenthesizedContext ctx) {
        visit(ctx.cond());
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondAND(XPathParser.CondANDContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        visit(ctx.cond(0));
        Boolean res1 = curCondRes;
        context = snapShot;
        visit(ctx.cond(1));
        Boolean res2 = curCondRes;
        context = snapShot;
        if (res1 && res2) {
            curCondRes = true;
            System.out.println("true");
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondOR(XPathParser.CondORContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        visit(ctx.cond(0));
        Boolean res1 = curCondRes;
        context = snapShot;
        visit(ctx.cond(1));
        Boolean res2 = curCondRes;
        context = snapShot;
        if (res1 || res2) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    @Override
    public LinkedList<Node> visitCondNOT(XPathParser.CondNOTContext ctx) {
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        visit(ctx.cond());
        Boolean res = curCondRes;
        context = snapShot;
        if (!res) {
            curCondRes = true;
        } else {
            curCondRes = false;
        }
        return new LinkedList<>();
    }

    // ap
    @Override
    public LinkedList<Node> visitAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx) {
        String xmlName = ctx.FILENAME().getText();

        // erase the quotes
        xmlName = xmlName.substring(1, xmlName.length() - 1);

        // verify file name is correct
        if (!fileName.endsWith(xmlName)) {
            throw new RuntimeException(
                    "File name is not consistent in query and argument! query: " + xmlName + ", argument: " + fileName);
        }

        // load the xml file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            try {
                doc = (Document) builder.parse(new File(fileName));
                doc.getDocumentElement().normalize();

                // initialize the result list
                tempResult = new LinkedList<>();
                tempResult.add(doc);

                LinkedList<Node> result = new LinkedList<>();
                LinkedList<Node> queue = new LinkedList<>(tempResult);

                while (!queue.isEmpty()) {
                    visit(ctx.rp());
                    result.addAll(tempResult);
                    result = new LinkedList<>(new LinkedHashSet<>(result));
                    LinkedList<Node> children = new LinkedList<>();
                    for (Node node : queue) {
                        int childCount = node.getChildNodes().getLength();
                        for (int i = 0; i < childCount; i++) {
                            Node child = node.getChildNodes().item(i);
                            children.add(child);
                        }
                    }
                    queue = children;
                    tempResult = queue;
                }
                tempResult = new LinkedList<>((new LinkedHashSet<>(result)));
                // tempResult = new LinkedList<>(new HashSet<>(result));
                return tempResult;
            } catch (SAXException | IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public LinkedList<Node> visitAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx) {
        String xmlName = ctx.FILENAME().getText();

        // erase the quotes
        xmlName = xmlName.substring(1, xmlName.length() - 1);

        // verify file name is correct
        if (!fileName.endsWith(xmlName)) {
            throw new RuntimeException(
                    "File name is not consistent in query and argument! query: " + xmlName + ", argument: " + fileName);
        }

        // load the xml file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            try {
                doc = (Document) builder.parse(new File(fileName));
                doc.getDocumentElement().normalize();

                // initialize the result list
                tempResult = new LinkedList<>();
                tempResult.add(doc);

                // [rp] means applying rp to current node
                visit(ctx.rp());

                // elimitae the repeated nodes
                tempResult = new LinkedList<>(new LinkedHashSet<>(tempResult));
                // tempResult = new LinkedList<>(new HashSet<>(tempResult));
                return tempResult;
            } catch (SAXException | IOException e) {
                e.printStackTrace();
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

    // rp
    @Override
    public LinkedList<Node> visitTagName_(XPathParser.TagName_Context ctx) {
        String tagString = ctx.getText();

        // filter children nodes
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            int childCount = node.getChildNodes().getLength();
            for (int i = 0; i < childCount; i++) {
                Node child = node.getChildNodes().item(i);
                if (child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(tagString)) {
                    result.add(child);
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitWildcard(XPathParser.WildcardContext ctx) {
        // get children nodes
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                int childCount = node.getChildNodes().getLength();
                for (int i = 0; i < childCount; i++) {
                    Node child = node.getChildNodes().item(i);
                    result.add(child);
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitCurrent(XPathParser.CurrentContext ctx) {
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitParent(XPathParser.ParentContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            Node parent = node.getParentNode();
            if (parent != null) {
                result.add(parent);
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitText(XPathParser.TextContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                Node child = node.getChildNodes().item(i);
                if (child.getNodeType() == Node.TEXT_NODE) {
                    result.add(child);
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitAttribute(XPathParser.AttributeContext ctx) {
        String attName = ctx.attName().getText();
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Node attribute = node.getAttributes().getNamedItem(attName);
                if (attribute != null) {
                    result.add(attribute);
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitParenthesizedRP(XPathParser.ParenthesizedRPContext ctx) {
        visit(ctx.rp());
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitPathSlash(XPathParser.PathSlashContext ctx) {
        LinkedList<Node> result = visit(ctx.rp(0));
        tempResult = result;
        visit(ctx.rp(1));
        tempResult = new LinkedList<>(new LinkedHashSet<>(tempResult));
        // tempResult = new LinkedList<>(new HashSet<>(tempResult));
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx) {
        visit(ctx.rp(0));
        // LinkedList<Node> descendants = getAllDescendants(tempResult);
        // tempResult.addAll(descendants);
        // visit(ctx.rp(1));
        // return tempResult;
        // use bfs to get results
        LinkedList<Node> result = new LinkedList<>();
        LinkedList<Node> queue = new LinkedList<>(new LinkedHashSet<>(tempResult));
        // LinkedList<Node> queue = new LinkedList<>(new HashSet<>(tempResult));
        while (!queue.isEmpty()) {
            visit(ctx.rp(1));
            result.addAll(tempResult);
            result = new LinkedList<>(new LinkedHashSet<>(result));
            // result = new LinkedList<>(new HashSet<>(result));
            LinkedList<Node> children = new LinkedList<>();
            for (Node node : queue) {
                int childCount = node.getChildNodes().getLength();
                for (int i = 0; i < childCount; i++) {
                    Node child = node.getChildNodes().item(i);
                    children.add(child);
                }
            }
            queue = children;
            tempResult = queue;
        }
        tempResult = result;
        tempResult = new LinkedList<>(new LinkedHashSet<>(tempResult));
        // tempResult = new LinkedList<>(new HashSet<>(tempResult));
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitPathFilter(XPathParser.PathFilterContext ctx) {
        visit(ctx.rp());
        visit(ctx.f());
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitPathComma(XPathParser.PathCommaContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result1 = visit(ctx.rp(0));
        tempResult = snapShot;
        LinkedList<Node> result2 = visit(ctx.rp(1));
        result1.addAll(result2);
        tempResult = result1;
        return tempResult;
    }

    // filter function
    @Override
    public LinkedList<Node> visitFilterRP(XPathParser.FilterRPContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : snapShot) {
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp());
            if (tempResult.size() > 0) {
                result.add(node);
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterEq(XPathParser.FilterEqContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : snapShot) {
            // evaluate the left part
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp(0));
            LinkedList<Node> resultLeft = new LinkedList<>(tempResult);

            // evaluate the right part
            tempResult = temp;
            visit(ctx.rp(1));
            LinkedList<Node> resultRight = new LinkedList<>(tempResult);

            // compare the intersection of two parts
            Boolean isEqual = false;
            for (Node left : resultLeft) {
                if (isEqual) {
                    break;
                }
                for (Node right : resultRight) {
                    if (left.isEqualNode(right)) {
                        result.add(node);
                        isEqual = true;
                        break;
                    }
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterEqual(XPathParser.FilterEqualContext ctx) {
        // the same as eq
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : snapShot) {
            // evaluate the left part
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp(0));
            LinkedList<Node> resultLeft = new LinkedList<>(tempResult);

            // evaluate the right part
            tempResult = temp;
            visit(ctx.rp(1));
            LinkedList<Node> resultRight = new LinkedList<>(tempResult);

            // compare the intersection of two parts
            Boolean isEqual = false;
            for (Node left : resultLeft) {
                if (isEqual) {
                    break;
                }
                for (Node right : resultRight) {
                    if (left.isEqualNode(right)) {
                        result.add(node);
                        isEqual = true;
                        break;
                    }
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : snapShot) {
            // evaluate the left part
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp(0));
            LinkedList<Node> resultLeft = new LinkedList<>(tempResult);

            // evaluate the right part
            tempResult = temp;
            visit(ctx.rp(1));
            LinkedList<Node> resultRight = new LinkedList<>(tempResult);

            // compare the intersection of two parts
            Boolean isEqual = false;
            for (Node left : resultLeft) {
                if (isEqual) {
                    break;
                }
                for (Node right : resultRight) {
                    if (left.isSameNode(right)) {
                        result.add(node);
                        isEqual = true;
                        break;
                    }
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterIs(XPathParser.FilterIsContext ctx) {
        // the same as double equal
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : snapShot) {
            // evaluate the left part
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp(0));
            LinkedList<Node> resultLeft = new LinkedList<>(tempResult);

            // evaluate the right part
            tempResult = temp;
            visit(ctx.rp(1));
            LinkedList<Node> resultRight = new LinkedList<>(tempResult);

            // compare the intersection of two parts
            Boolean isEqual = false;
            for (Node left : resultLeft) {
                if (isEqual) {
                    break;
                }
                for (Node right : resultRight) {
                    if (left.isSameNode(right)) {
                        result.add(node);
                        isEqual = true;
                        break;
                    }
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterStringConstant(XPathParser.FilterStringConstantContext ctx) {
        String stringConstant = ctx.STRING().getText();
        stringConstant = stringConstant.substring(1, stringConstant.length() - 1);

        LinkedList<Node> result = new LinkedList<>();
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        for (Node node : snapShot) {
            LinkedList<Node> temp = new LinkedList<>();
            temp.add(node);
            tempResult = temp;
            visit(ctx.rp());
            for (Node tempNode : tempResult) {
                if (tempNode.getNodeType() == Node.TEXT_NODE && tempNode.getTextContent().equals(stringConstant)) {
                    result.add(node);
                    break;
                }
            }
        }
        tempResult = result;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx) {
        visit(ctx.f());
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterAnd(XPathParser.FilterAndContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result1 = visit(ctx.f(0));
        tempResult = snapShot;
        LinkedList<Node> result2 = visit(ctx.f(1));
        result1.retainAll(result2);
        tempResult = result1;
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterOr(XPathParser.FilterOrContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> result1 = visit(ctx.f(0));
        tempResult = snapShot;
        LinkedList<Node> result2 = visit(ctx.f(1));
        result1.addAll(result2);
        // eliminate the repeated nodes
        tempResult = new LinkedList<>(new LinkedHashSet<>(result1));
        // tempResult = new LinkedList<>(new HashSet<>(result1));
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterNot(XPathParser.FilterNotContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        LinkedList<Node> notResult = visit(ctx.f());
        snapShot.removeAll(notResult);
        tempResult = snapShot;
        return tempResult;
    }

    // helper function

    // dive into the forclause, use backtracking to get all the results
    private void visitforClauseList(List<XPathParser.VarBindingContext> varBindings, int index,
            LinkedList<HashMap<String, LinkedList<Node>>> result) {
        if (index == varBindings.size()) {
            result.add(new HashMap<>(context));
            return;
        }
        String var = varBindings.get(index).Var().getText();
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> value = visit(varBindings.get(index).xq());
        // System.out.println("var: " + var);
        // System.out.println("initial values: ");
        // for (Node node : value) {
        //     System.out.println(node.getTextContent());
        // }
        // System.out.println("context: ");
        // for (String key : context.keySet()) {
        //     System.out.println(key);
        //     for (Node node : context.get(key)) {
        //         System.out.println(node.getTextContent());
        //     }
        // }
        // System.out.println("--------------------------------------");
        // if (varBindings.get(index).xq().getText().equals("$s/text()")) {
        //     for (Node node : value) {
        //         System.out.println(node.getTextContent());
        //     }
        // }
        context = snapShot;
        if (value == null) {
            return;
        }
        // if (index == 0) {
        //     System.out.println("Value size before loop: " + value.size());
        // }
        for (Node node : value) {
            // System.out.println("index: " + index);
            HashMap<String, LinkedList<Node>> temp = new HashMap<>(context);
            LinkedList<Node> item = new LinkedList<>();
            item.add(node);
            context.put(var, item);
            visitforClauseList(varBindings, index + 1, result);
            context = temp;
        }
        context = snapShot;
    }

    private void visitSomeClauseList(List<XPathParser.VarInXQContext> varBindings, int index,
            LinkedList<HashMap<String, LinkedList<Node>>> result) {
        if (index == varBindings.size()) {
            result.add(new HashMap<>(context));
            return;
        }
        String var = varBindings.get(index).Var().getText();
        HashMap<String, LinkedList<Node>> snapShot = new HashMap<>(context);
        LinkedList<Node> value = visit(varBindings.get(index).xq());
        context = snapShot;
        if (value == null) {
            return;
        }
        for (Node node : value) {
            HashMap<String, LinkedList<Node>> temp = new HashMap<>(context);
            LinkedList<Node> item = new LinkedList<>();
            item.add(node);
            context.put(var, item);
            visitSomeClauseList(varBindings, index + 1, result);
            context = temp;
        }
        context = snapShot;
    }

}
