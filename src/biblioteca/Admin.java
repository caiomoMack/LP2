/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Admin extends Usuario {
    final boolean ADMIN = true;
    public Admin() {
    }

    public Admin(String nome, String endereco, int telefone, String RG) {
        super(nome, endereco, telefone, RG);
    }

    public boolean getADMIN() {
        return ADMIN;
    }
    
}
