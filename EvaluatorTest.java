import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class EvaluatorTest {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        try {
            Document doc = evaluator.evaluate();
            // traverse the document
            // System.out.println("Traverse the document:");
            // traverse(doc, 0);

            // write the document to XML file
            System.out.println("Write the document to XML file: output.xml");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(new DOMSource(doc), new StreamResult(new java.io.File("output.xml")));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // private static void traverse(Node tree, int level) {
    //     String indent = "";
    //     for (int i = 0; i < level; i++) {
    //         indent += "  ";
    //     }
    //     System.out.println(indent + tree.getNodeName());
    //     for (int i = 0; i < tree.getChildNodes().getLength(); i++) {
    //         traverse(tree.getChildNodes().item(i), level + 1);
    //     }
    // }
}