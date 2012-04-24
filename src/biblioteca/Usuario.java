/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.text.MessageFormat;

/**
 *
 * @author hkom
 */
public abstract class Usuario {
    private int codigo;  
    private String nome;
    private String login;
    private String endereco;
    private int telefone;
    private String RG;
    private String senha;
    protected  boolean ADMIN = false;

    public boolean getADMIN() {
        return ADMIN;
    }
    
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
        	Object[] info = {nome,login,endereco,telefone,RG};
	String informacoes = "(nome: {0})\n(login: {1})\n(endereco: {2})\n(telefone: {3})\n(RG: {4})";
	return MessageFormat.format(informacoes, info);
        //return "Usuario{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", RG=" + RG + '}';
    }    

    public boolean setSenha(String novaSenha, String senhaAntiga) {
        if(senhaAntiga.equals(senha)){
            senha = novaSenha;
            return true;
        }
        return false;
    }

    public String getLogin() {
        return login;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
