/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

    public static final int USUARIOS = 50;
    public static final String[] elementosUsuario = {"nome", "login", "endereco", "telefone", "RG","ADMIN"};
    private static boolean sucesso = false;

    public WriteXMLFile(String listaUsuario) {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(WriteXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Usuarios");
        doc.appendChild(rootElement);

        // staff elements
        Element usuario = doc.createElement("código");
        rootElement.appendChild(usuario);

        // set attribute to staff element
        Attr attr = doc.createAttribute("numero");
        attr.setValue("1");
        usuario.setAttributeNode(attr);
        int i;

        // shorten way
        // staff.setAttribute("id", "1");
        String nomeDosFilhos[] = null;
        String conteudoDosFilhos[] = null;
        // firstname elements
        CriarElemento(doc, usuario, nomeDosFilhos[0], conteudoDosFilhos[0]);

        /*
         * Element nome = doc.createElement("nome");
         * nome.appendChild(doc.createTextNode("yong"));
         * usuario.appendChild(nome);
         *
         * // lastname elements Element endereco =
         * doc.createElement("endereco");
         * endereco.appendChild(doc.createTextNode("mook kim"));
         * usuario.appendChild(endereco);
         *
         * // nickname elements Element telefone =
         * doc.createElement("telefone");
         * telefone.appendChild(doc.createTextNode("mkyong"));
         * usuario.appendChild(telefone);
         *
         * // salary elements Element RG = doc.createElement("RG");
         * RG.appendChild(doc.createTextNode("100000"));
         * usuario.appendChild(RG);
         */
        //grava Arquivo XML na pasta do projeto.
        writeXml(doc, "destino.xml");
        System.out.println("File saved!");


    }

    public static String[] getNomes(int tipoDeNome) {
        switch (tipoDeNome) {
            case USUARIOS:
                return elementosUsuario;
        }
        return null;
    }

    // escreve o usuario no xml
    public WriteXMLFile(String nome, String login, String endereco, int telefone, String RG,boolean ADMIN) {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        String nomeDoFilho[] = getNomes(USUARIOS);
        String infoUsuario[] = new String[6];
        infoUsuario[0] = nome;
        infoUsuario[1] = login;
        infoUsuario[2] = endereco;
        infoUsuario[3] = "" + telefone;
        infoUsuario[4] = RG;
        infoUsuario[5] = "" + ADMIN;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(WriteXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Usuarios");
        doc.appendChild(rootElement);

        // staff elements
        Element usuario = doc.createElement("código");
        rootElement.appendChild(usuario);

        // set attribute to staff element
        Attr attr = doc.createAttribute("numero");
        attr.setValue("1");
        usuario.setAttributeNode(attr);
        for (int i = 0; i < infoUsuario.length; i++) {
            CriarElemento(doc, usuario, nomeDoFilho[i], infoUsuario[i]);
        }
        writeXml(doc, "destino.xml");
        System.out.println("File saved!");
    }

    private void CriarElemento(Document doc, Element raiz, String nomeDoFilho, String conteudoDoFilho) {
        Element filho = doc.createElement(nomeDoFilho);
        filho.appendChild(doc.createTextNode(conteudoDoFilho));
        raiz.appendChild(filho);
    }

    public static void writeXml(Document doc, String filename) {

        // Prepare the DOM document for writing
        Source source = new DOMSource(doc);

        // Prepare the output file
        File file = new File(filename);
        Result result = new StreamResult(file);

        // Write the DOM document to the file
        Transformer xformer = null;
        try {
            xformer = TransformerFactory.newInstance().newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(WriteXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        // identa arquivo XML
        xformer.setOutputProperty(OutputKeys.INDENT, "yes");
        try {
            xformer.transform(source, result);
            sucesso = true;
        } catch (TransformerException ex) {
            Logger.getLogger(WriteXMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
