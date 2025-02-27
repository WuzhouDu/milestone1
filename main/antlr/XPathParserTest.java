package antlr;

import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.*;
import org.antlr.v4.gui.Trees;

public class XPathParserTest {
    public static void main(String[] args) throws Exception {
        

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter XPath expression:");
        // String input = scanner.nextLine();
        // scanner.close();
        // String input = "<result>{\n" + //
        //         "for $a in document(\"j_caesar.xml\")//ACT,\n" + //
        //         "    $sc in $a//SCENE,\n" + //
        //         "    $sp in $sc/SPEECH\n" + //
        //         "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\" \n" + //
        //         "return <who>{$sp/SPEAKER/text()}</who>,\n" + //
        //         "    <when>{<act>{$a/TITLE/text()}</act>, \n" + //
        //         "        <scene>{$sc/TITLE/text()}</scene>}\n" + //
        //         "    </when> }\n" + //
        //         "</result>";

        String inputFile = args[0];
        // read the whole input txt file
        Scanner scanner = new Scanner(new java.io.File(inputFile));
        String input = "";
        while (scanner.hasNextLine()) {
            input += scanner.nextLine();
        }
        scanner.close();

        CharStream inputStream = CharStreams.fromString(input);

        XPathLexer lexer = new XPathLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XPathParser parser = new XPathParser(tokens);
        ParseTree tree = parser.xq();

        System.out.println("Parse Tree:");
        // System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        // traverse the treenode, do not use listener or visitor
        System.out.println("Traverse the tree:");
        traverse(tree, 0);
}

    private static void traverse(ParseTree tree, int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += "  ";
        }
        if (tree instanceof TerminalNode) {
            System.out.println(indent + tree.getClass().getSimpleName() + ": " + tree.getText());
            return;
        }
        int ruleIndex = ((ParserRuleContext) tree).getRuleIndex();
        String ruleName = XPathParser.ruleNames[ruleIndex];
        System.out.println(indent + ruleName + " " + tree.getClass().getSimpleName());
        for (int i = 0; i < tree.getChildCount(); i++) {
            traverse(tree.getChild(i), level + 1);
        }
    }
}
