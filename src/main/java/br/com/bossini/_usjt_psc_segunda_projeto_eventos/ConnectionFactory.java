/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos;
import java.sql.*;
/**
 *
 * @author rodrigo
 */
public class ConnectionFactory {
    private String host = "pg-33ad0904-professorbossini.a.aivencloud.com";
    private String porta = "12956";
    private String banco = "defaultdb";
    private String usuario = "";
    private String senha = "";
    public Connection obterConexao() throws Exception{
        String s = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, porta, banco
        );
        return DriverManager.getConnection(s, usuario, senha);
    }
    
}
