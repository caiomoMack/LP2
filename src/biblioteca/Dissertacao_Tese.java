/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public class Dissertacao_Tese extends Item{
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private String cidade;
    private int ano;
    private String instituicao;
    private String grau;

    public Dissertacao_Tese() {
    }

    public Dissertacao_Tese(String titulo, String autor, int numeroDePaginas, String cidade, int ano, String instituicao, String grau) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.cidade = cidade;
        this.ano = ano;
        this.instituicao = instituicao;
        this.grau = grau;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Dissertacao_Tese{" + "titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + ", cidade=" + cidade + ", ano=" + ano + ", instituicao=" + instituicao + ", grau=" + grau + '}';
    }
    
}
