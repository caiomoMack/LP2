/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public abstract class Item {
    private String titulo;
    private String autor;
    private int ano;
    private boolean emprestado;

    public Item() {
    }

    public Item(String titulo, String autor, int ano,
            boolean emprestado, String localizacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = emprestado;
        this.localizacao = localizacao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    private String localizacao;
    
    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTitulo() {
        return titulo;
    }
    
    @Override
    public String toString() {
        return "Item{" + "titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", emprestado=" + emprestado + ", localizacao=" + localizacao + '}';
    }
}
