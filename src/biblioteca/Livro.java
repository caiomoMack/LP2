/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Livro extends Item {
    private String editora;
    private int numeroDePaginas;
    private int anoDeEdicao;

    public Livro() {
    }

    public Livro(String editora, int numeroDePaginas, int anoDeEdicao) {
        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    public Livro(String editora, int numeroDePaginas, int anoDeEdicao, String titulo,
                 String autor, int ano, boolean emprestado, String localizacao) {
        super(titulo, autor, ano, emprestado, localizacao);
        this.editora = editora;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    public void setAnoDeEdicao(int anoDeEdicao) {
        this.anoDeEdicao = anoDeEdicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    
    public int getAnoDeEdicao() {
        return anoDeEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Livro{" + "editora=" + editora + ", numeroDePaginas=" + numeroDePaginas + ", anoDeEdicao=" + anoDeEdicao + '}';
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
