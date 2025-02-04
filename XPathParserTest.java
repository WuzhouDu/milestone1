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
        String input = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text() = \"CAESAR\"]";
        CharStream inputStream = CharStreams.fromString(input);
        
        XPathLexer lexer = new XPathLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        XPathParser parser = new XPathParser(tokens);
        ParseTree tree = parser.ap();
        
        System.out.println("Parse Tree:");
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        // traverse the treenode
        System.out.println("Traverse the tree:");
        XPathBaseListener listener = new XPathBaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
    }
}
