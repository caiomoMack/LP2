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
    
        Usuario user = new Usuario("nome", "end", 1234, "RG","login") {};
        
        System.out.println(user.toString());
        System.out.println(user.toString());
        System.out.println(user.toString().startsWith("("));
        
        
    }
    
    
}
