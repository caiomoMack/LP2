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
    
    public Admin() {
        this.ADMIN = true;
    }

    public Admin(String nome, String endereco, int telefone, String RG, String login) {
        super(nome, endereco, telefone, RG, login);
         this.ADMIN = true;
    }

    

    @Override
    public boolean getADMIN() {
        return ADMIN;
    }
    
}
