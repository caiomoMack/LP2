/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Usuarios {
    public static void main(String[] args) {
    
        
        ReadXMLFile  test = new ReadXMLFile();
        Usuario[] retornaUsuarios = test.retornaUsuarios();
             
        System.out.println(retornaUsuarios[0].getNome());
        
        
        
    }
    
    
}
