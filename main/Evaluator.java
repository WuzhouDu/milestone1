import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import antlr.XPathCustomVisitor;
import antlr.XPathLexer;
import antlr.XPathParser;

public class Evaluator {
    String query;
    String inputFileName;
    public Evaluator(String query, String inputFileName) {
        this.query = query;
        this.inputFileName = inputFileName;
    }

    // main entry
    public Document evaluate() throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter XPath expression:");
        // String query = scanner.nextLine();
        // scanner.close();

        // String query = "doc(\"j_caesar.xml\")//PERSONA";
        // String query = "doc(\"j_caesar.xml\")//SCENE[SPEECH/SPEAKER/text() = \"CAESAR\"]";
        // String query = "doc(\"j_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text() =\"CAESAR\" and SPEECH/SPEAKER/text() = \"BRUTUS\"]]";
        // String query = "doc(\"j_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text() =\"CAESAR\"][SPEECH/SPEAKER/text() = \"BRUTUS\"]]";
        // String query = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"]";
        
        CharStream inputStream = CharStreams.fromString(query);
        XPathLexer lexer = new XPathLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        ParseTree queryAST = parser.ap();
        // Trees.inspect(queryAST, parser);

        Document result = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = result.createElement("Results");

        // use visitor
        XPathCustomVisitor visitor = new XPathCustomVisitor(inputFileName);
        List<Node> resultNodes = visitor.visit(queryAST);
        // System.out.println("Result: " + resultNodes.size());
        for (Node node : resultNodes) {
            Node importedNode = result.importNode(node, true);
            root.appendChild(importedNode);
        }
        result.appendChild(root);

        return result;
    }

    // ap semantic function
    // private List<Node> ap(Node node, ParseTree context) {
    //     assert node.getNodeType() == Node.DOCUMENT_NODE;
    //     if (context.getClass().getSimpleName() == "AbsolutePathDoubleSlashContext") {
    //         return 
    //     } else {
    //         Node rpNode = context.
    //     }
    // }

    // rp semantic function

    // filter semantic function


    // basic semantic function
    // private List<Node> rp(ParseTree rpNode, Node node) {
    //     if (rpNode.getClass().getSimpleName() == "TagNameContext" || rpNode.getClass().getSimpleName() == "TagNameContext_") {
    //         return tag(rpNode, node);
    //     } 
    // }

    // private List<Node> tag(ParseTree rpNode, Node node) {
    //     assert node.getNodeType() == Node.ELEMENT_NODE;
    //     List<Node> result = new ArrayList<>();
    //     String tagName = rpNode.getText();
    //     NodeList children = node.getChildNodes();
    //     for (int i = 0; i < children.getLength(); i++) {
    //         Node child = children.item(i);
    //         if (child.getNodeType() == Node.ELEMENT_NODE && child.getNodeName().equals(tagName)) {
    //             result.add(child);
    //         }
    //     }
    //     return result;
    // }
}
