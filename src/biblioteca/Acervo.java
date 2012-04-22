/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Acervo {
    private Item[] listaItens = new Item[10];

    public Acervo() {
    }
    
    public boolean addAcervo(Item item){
        boolean adicionado = false;
        if (listaItens[listaItens.length -1] != null){
            Item[] listaAux = new Item[listaItens.length*2];            
        listaItens = listaAux;
        }
        for(int i = 0; i < listaItens.length -1; i++){
            listaItens[i] = item;
            adicionado = true;
        }
        return adicionado;
    }
}
