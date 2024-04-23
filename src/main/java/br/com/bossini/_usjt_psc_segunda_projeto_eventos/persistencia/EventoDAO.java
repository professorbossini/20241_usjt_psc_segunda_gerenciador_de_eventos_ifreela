/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;

import br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 821231962
 */
public class EventoDAO {
    public void cadastrar (Evento e) throws Exception{
    var sql = "INSERT INTO tb_evento_psc_segunda (nome, descricao) VALUES (?,?)";
    Connection conexao = new ConnectionFactory().obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql);
     ps.setString(1, e.getNome());
        ps.setString(2, e.getDescricao());
        
   ps.execute();
conexao.close();

     
     }
    }

