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
    private String login;
    private String endereco;
    private int telefone;
    private String RG;
    private String senha;
    boolean ADMIN = false;
    
    public Usuario(String nome, String endereco, int telefone, String RG, String login) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.RG = RG;
        this.senha = RG;
        this.login = login;
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

    public boolean setSenha(String novaSenha, String senhaAntiga) {
        if(senhaAntiga.equals(senha)){
            senha = novaSenha;
            return true;
        }
        return false;
    }

}
