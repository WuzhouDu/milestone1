import org.w3c.dom.*;

public class XMLLoaderTest {
    public static void main(String[] args) throws Exception {
        String filePath = "../../j_caesar.xml";
        Document doc = XMLLoader.loadXML(filePath);

        Element root = doc.getDocumentElement();
        printXML(root, 0);
    }

    private static void printXML(Node node, int depth) {
        // 打印缩进
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        // 打印节点名称
        System.out.println(node.getNodeName() + ": " + node.getNodeValue());

        // 递归遍历子节点
        NodeList children = node.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            printXML(children.item(i), depth + 1);
        }
    }
}
