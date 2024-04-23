/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;
import java.sql.*;
/**
 *
 * @author rodrigo
 */
public class ConnectionFactory {
    private String host = "pg-88b7406-joaovini1124-f1c6.a.aivencloud.com";
    private String porta = "10112";
    private String banco = "defaultdb";
    private String usuario = "avnadmin";
    private String senha = "AVNS_bxtXhYTWVahsCBiW1pO";
    public Connection obterConexao() throws Exception{
        String s = String.format(
            "jdbc:postgresql://%s:%s/%s",
            host, porta, banco
        );
        return DriverManager.getConnection(s, usuario, senha);
    }
    
}
