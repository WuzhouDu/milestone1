package main;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;

public class XMLLoader {
    public static Document loadXML(String filePath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        return builder.parse(new File(filePath));
    }
}