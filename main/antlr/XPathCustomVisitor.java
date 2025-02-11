package antlr;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;

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

    public XPathCustomVisitor(String fileName) {
        this.fileName = fileName;
    }

    // ap
    @Override
    public LinkedList<Node> visitAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx) {
        String xmlName = ctx.FILENAME().getText();

        // erase the quotes
        xmlName = xmlName.substring(1, xmlName.length() - 1);

        // verify file name is correct
        if (!xmlName.equals(fileName)) {
            throw new RuntimeException("File name is not consistent in query and argument! query: " + xmlName + ", argument: " + fileName);
        }

        // load the xml file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            try {
                doc = (Document) builder.parse(new File(xmlName));
                doc.getDocumentElement().normalize();

                // initialize the result list
                tempResult.add(doc);

                LinkedList<Node> result = new LinkedList<>();
                LinkedList<Node> queue = new LinkedList<>(tempResult);

                while (!queue.isEmpty()) {
                    // System.out.println("1");
                    visit(ctx.rp());
                    result.addAll(tempResult);
                    LinkedList<Node> children = new LinkedList<>();
                    for (Node node : queue) {
                        // System.out.println(node.hashCode());
                        int childCount = node.getChildNodes().getLength();
                        for (int i = 0; i < childCount; i++) {
                            Node child = node.getChildNodes().item(i);
                            // System.out.println(node.hashCode());
                                // System.out.println(node.hashCode());
                            children.add(child);
                        }
                    }
                    queue = children;
                    tempResult = queue;
                }
                tempResult = result;
                return tempResult;

                // // [.//rp] means applying rp to current node and all descendants
                // LinkedList<Node> descendants = getAllDescendants(tempResult);
                // tempResult.addAll(descendants);

                // visit(ctx.rp());

                // // elimitae the repeated nodes
                // tempResult = new LinkedList<>(new HashSet<>(tempResult));

                // return tempResult;
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
        if (!xmlName.equals(fileName)) {
            throw new RuntimeException(
                    "File name is not consistent in query and argument! query: " + xmlName + ", argument: " + fileName);
        }

        // load the xml file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            try {
                doc = (Document) builder.parse(new File(xmlName));
                doc.getDocumentElement().normalize();

                // initialize the result list
                tempResult.add(doc);

                // [rp] means applying rp to current node
                visit(ctx.rp());

                // elimitae the repeated nodes
                tempResult = new LinkedList<>(new HashSet<>(tempResult));

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

        // System.out.println("tagname: " + tagString);

        // filter children nodes
        LinkedList<Node> result = new LinkedList<>();
        for (Node node : tempResult) {
            // System.out.println("element node: " + node.getNodeName());
            int childCount = node.getChildNodes().getLength();
            for (int i = 0; i < childCount; i++) {
                Node child = node.getChildNodes().item(i);
                if (child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(tagString)) {
                    result.add(child);
                    // System.out.println(child.getTextContent());
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
            // System.out.println("text node ?: " + node.getNodeName());
            for (int i = 0; i < node.getChildNodes().getLength(); i++) {
                Node child = node.getChildNodes().item(i);
                if (child.getNodeType() == Node.TEXT_NODE) {
                    // System.out.println("text node !: " + child.getTextContent());
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
        LinkedList<Node> queue = new LinkedList<>(new HashSet<>(tempResult));
        // System.out.println("1");
        while (!queue.isEmpty()) {
            // System.out.println("1");
            visit(ctx.rp(1));
            result.addAll(tempResult);
            result = new LinkedList<>(new HashSet<>(result));
            LinkedList<Node> children = new LinkedList<>();
            for (Node node : queue) {
                // System.out.println(node.hashCode());
                int childCount = node.getChildNodes().getLength();
                for (int i = 0; i < childCount; i++) {
                    Node child = node.getChildNodes().item(i);
                    // System.out.println(node.hashCode());
                        // System.out.println(node.hashCode());
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
    public LinkedList<Node> visitPathFilter(XPathParser.PathFilterContext ctx) {
        visit(ctx.rp());
        // System.out.println("path filter");

        // for (Node node : tempResult) {
        // System.out.println(node.getNodeName());
        // }
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
        // System.out.println("string constant: " + stringConstant);

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
        tempResult = new LinkedList<>(new HashSet<>(result1));
        return tempResult;
    }

    @Override
    public LinkedList<Node> visitFilterNot(XPathParser.FilterNotContext ctx) {
        LinkedList<Node> snapShot = new LinkedList<>(tempResult);
        // System.out.println("not filter");
        LinkedList<Node> notResult = visit(ctx.f());
        // for (Node node : notResult) {
        //     System.out.println(node.getNodeName());
        // }
        snapShot.removeAll(notResult);
        tempResult = snapShot;
        return tempResult;
    }

    // helper function
    // private LinkedList<Node> getAllDescendants(LinkedList<Node> nodes) {
    //     if (nodes.size() == 0) {
    //         return new LinkedList<>();
    //     }

    //     // get descendants by level
    //     LinkedList<Node> descendants = new LinkedList<>();
    //     LinkedList<Node> children = new LinkedList<>();
    //     for (Node node : nodes) {
    //         descendants.add(node);
    //         if (node.hasChildNodes()) {
    //             int childCount = node.getChildNodes().getLength();
    //             for (int i = 0; i < childCount; i++) {
    //                 children.add(node.getChildNodes().item(i));
    //             }
    //         }
    //     }
    //     descendants.addAll(getAllDescendants(children));
    //     return descendants;
    // }
}
