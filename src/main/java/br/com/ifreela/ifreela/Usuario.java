/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela;

/**
 *
 * @author 82329522
 */
/*
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    
    //construtor
    public Usuario(){}
    
    public Usuario(int codigo, String login, String senha){
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;        
    }
}*/

public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipoUsuario;
    
    public Usuario() {}
    
    public Usuario(String login, String senha, int tipoUsuario) {
        this.login = login;
        this.senha = senha;  
        this.tipoUsuario = tipoUsuario;
    }
    public Usuario(String login, String senha){
        this(login, senha, 0);   
    }
    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}