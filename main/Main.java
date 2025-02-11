import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Main {
    public static void main(String[] args) throws Exception {
        // given three arguments: input xml file, input query txt file, output xml file
        if (args.length != 3) {
            System.err.println("Usage: java Main <input_xml_file> <input_query_file> <output_xml_file>");
            System.exit(1);
        }

        String inputFileName = args[0];
        String queryFileName = args[1];
        String outputFileName = args[2];

        // load the query string from file
        File queryFile = new File(queryFileName);
        Scanner scanner;
        try {
            scanner = new Scanner(queryFile);
            String query = scanner.nextLine();
            scanner.close();
            Evaluator evaluator = new Evaluator(query, inputFileName);
            Document doc = evaluator.evaluate();
            // write the document to XML file
            System.out.println("Write the document to XML file: output.xml");
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(new DOMSource(doc), new StreamResult(new java.io.File(outputFileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
