/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class AnaisDeEventos extends Item{
    private String nomeDoEvento;
    private String editora;
    private String titulo;
    private int anoDePublicacao;
    private String cidade;

    public AnaisDeEventos() {
    }

    public AnaisDeEventos(String nomeDoEvento, String editora, String titulo, int anoDePublicacao, String cidade) {
        this.nomeDoEvento = nomeDoEvento;
        this.editora = editora;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.cidade = cidade;
    }

    public AnaisDeEventos(String nomeDoEvento, String editora, int anoDePublicacao,
                          String cidade, String titulo, String autor, int ano,
                          boolean emprestado, String localizacao) {
        this.nomeDoEvento = nomeDoEvento;
        this.editora = editora;
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.cidade = cidade;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    @Override
    public String toString() {
        return "AnaisDeEventos{" + "nomeDoEvento=" + nomeDoEvento + ", editora=" + editora + ", titulo=" + titulo + ", anoDePublicacao=" + anoDePublicacao + ", cidade=" + cidade + '}';
    }

    @Override
    public void estaEmprestado(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void empresta(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void devolvido(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void descricaoSumaria(Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
