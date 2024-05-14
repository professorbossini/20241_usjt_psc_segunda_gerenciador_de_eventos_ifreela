/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;

import br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 821231962
 */
public class EventoDAO {
    public void cadastrar (Evento e) throws Exception{
    var sql = "INSERT INTO tb_evento_psc_segunda (nome, descricao, data_inicio, data_termino) VALUES (?,?,?,?)";
    Connection conexao = new ConnectionFactory().obterConexao();
    PreparedStatement ps = conexao.prepareStatement(sql);
     ps.setString(1, e.getNome());
     ps.setString(2, e.getDescricao());
     ps.setDate(3, new java.sql.Date(e.getDataInicio().getTime()));
     ps.setDate(4, new java.sql.Date(e.getDataFim().getTime()));
        
   ps.execute();
conexao.close();

     
     }
    public List<Evento> listar() throws Exception{
        var eventos = new ArrayList<Evento>();
        var sql = "SELECT * FROM tb_evento_psc_segunda";
        try(var conexao = new ConnectionFactory().obterConexao();
                var ps =conexao.prepareStatement(sql);
                var rs = ps.executeQuery();
                ){
            while (rs.next()){
                var nome = rs.getString("nome");
                var descricao = rs.getString ("descricao");
                var dataInicio = new java.util.Date(rs.getDate("data_inicio").getTime());
                var dataFim = new java.util.Date(rs.getDate("data_fim").getTime());
                var e = new Evento();
                e.setNome(nome);
                e.setDescricao(descricao);
                e.setDataInicio(dataInicio);
                e.setDataFim(dataFim);
                eventos.add(e);
            }
            return eventos;
           
            
        }
    }
}

