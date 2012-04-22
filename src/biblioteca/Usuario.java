/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author hkom
 */
public abstract class Usuario {
    private String nome;
    private String endereco;
    private int telefone;
    private String RG;
    private String senha;
    
    public Usuario(String nome, String endereco, int telefone, String RG) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.RG = RG;
        this.senha = RG;
    }

    public Usuario() {
    }

    public String getRG() {
        return RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", RG=" + RG + '}';
    }

}
