/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo;

/**
 *
 * @author rodrigo
 */
public class Usuario {
    private int codigo;
    private String login;
    private String senha;
    private int tipo;
    
    //isso é um construtor
    public Usuario(){}
    
    //outro construtor
    public Usuario(int codigo, String login, String senha){
        this.codigo = codigo;
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario(String login, String senha){
        this(0, login, senha);
    }
    
    public String getLogin(){
        return login;
    }
    
    //como fica para obter a senha
    public String getSenha(){
        return senha;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    
    
}
