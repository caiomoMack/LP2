/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public interface ItemDeBiblioteca {  
    void estaEmprestado(Item item);
    void empresta(Item item);
    void devolvido(Item item);
    void descricaoSumaria(Item item);
}
