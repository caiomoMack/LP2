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
    final int MAX_ITENS_EMPRESTADOS = 5;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, int telefone, String RG) {
        super(nome, endereco, telefone, RG);
    }
    
    
}
