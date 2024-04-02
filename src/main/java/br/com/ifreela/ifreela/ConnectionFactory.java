/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela;
import java.sql.*;
/**
 *
 * @author 82329522
 */
public class ConnectionFactory {
        private String host = "pg-1edc1c76-ifreela.a.aivencloud.com" ;
        private String porta = "18910";
        private String banco = "defaultdb";
        private String usuario = "";
        private String senha = "";
        public Connection obterConexao() throws Exception{
            String s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                host,porta, banco
        );
        return DriverManager.getConnection(s, usuario, senha);
        
    }
    
}

/*import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String host = "pg-1edc1c76-ifreela.a.aivencloud.com";
    private String porta = "18910";
    private String banco = "defaultdb";
    private String usuario = "";
    private String senha = "";

    public Connection obterConexao() throws Exception {
        String url = String.format("jdbc:postgresql://%s:%s/%s", host, porta, banco);
        return DriverManager.getConnection(url, usuario, senha);
    }
}*/
