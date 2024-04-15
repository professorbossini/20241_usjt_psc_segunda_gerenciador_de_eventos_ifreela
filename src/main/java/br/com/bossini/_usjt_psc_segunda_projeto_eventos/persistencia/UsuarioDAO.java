/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;

import br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo.Usuario;
import br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rodrigo
 */
//data access object
public class UsuarioDAO {   
    public Usuario existe(Usuario u) throws Exception{
        //1. Especificar o comando SQL (SELECT)
        String sql = "SELECT * FROM tb_usuario_psc_segunda WHERE login = ? AND senha = ?";
        //2. Estabelecer uma conexão com o banco de dados
        Connection conexao = new ConnectionFactory().obterConexao();
        //3. Preparar o comando SQL
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5. Executar o comando
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int tipo = rs.getInt("tipo_usuario");
            u.setTipo(tipo);
            return u;
        }
        else{
            return null;
        }
    }
}
