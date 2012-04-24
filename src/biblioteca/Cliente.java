/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Cliente extends Usuario{

    @Override
    public boolean getADMIN() {
        return ADMIN;
    }
    final int MAX_ITENS_EMPRESTADOS = 5;

    public int getMAX_ITENS_EMPRESTADOS() {
        return MAX_ITENS_EMPRESTADOS;
    }
    public Cliente() {
    }

    public Cliente(String nome, String endereco, int telefone, String RG, String login) {
        super(nome, endereco, telefone, RG, login);
    }

    
    
    
}
