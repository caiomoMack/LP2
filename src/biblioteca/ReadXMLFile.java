/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXMLFile {

    public Usuario[] retornaUsuarios() {

        File fXmlFile = new File("F:\\trabalhos\\LP2\\destino.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ReadXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        Document doc = null;
        try {
            doc = dBuilder.parse(fXmlFile);
        } catch (SAXException ex) {
            Logger.getLogger(ReadXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.getDocumentElement().normalize();

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("Usuarios");
        System.out.println("-----------------------");

        Usuario listaDeUsuarios[] = new Usuario[nList.getLength()];
        Usuario newUsuario = null;
        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;
                //Usuario usuario = new Usuario();
                System.out.println("First Name : " + getTagValue("nome", eElement));
                System.out.println("Last Name : " + getTagValue("endereco", eElement));
                System.out.println("Nick Name : " + getTagValue("telefone", eElement));
                System.out.println("Salary : " + getTagValue("RG", eElement));
                System.out.println("ADMIN : " + getTagValue("ADMIN", eElement));
                if (Boolean.parseBoolean(getTagValue("ADMIN", eElement))) {
                    newUsuario = new Admin(getTagValue("nome", eElement)
                            , getTagValue("endereco", eElement)
                            , Integer.parseInt(getTagValue("telefone", eElement))
                            , getTagValue("RG", eElement)
                            , getTagValue("login", eElement));
                }else{
                    newUsuario = new Cliente(getTagValue("nome", eElement)
                            , getTagValue("endereco", eElement)
                            , Integer.parseInt(getTagValue("telefone", eElement))
                            , getTagValue("RG", eElement)
                            , getTagValue("login", eElement));
                }
            }
            listaDeUsuarios[0] = newUsuario;
        }
        return listaDeUsuarios;
    }

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

        Node nValue = (Node) nlList.item(0);

        return nValue.getNodeValue();
    }
}
