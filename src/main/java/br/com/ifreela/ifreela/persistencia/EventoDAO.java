/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela.persistencia;

import br.com.ifreela.ifreela.modelo.Evento;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 82329522
 */
public class EventoDAO {
    public void cadastrar(Evento e) throws Exception{
        //1. Especificar o comando SQL (INSERT)
       var sql = "INSERT INTO tb_evento_psc_segunda (nome, descricao) VALUES (?, ?)";
        //try-with-resources
        //2. Abrir uma conexão com o banco
       try(var conexao = new ConnectionFactory().obterConexao()){ 
            //3. Preparar o comando
            var ps = conexao.prepareStatement(sql);
            //4. Subistituir os eventuais placeholders
            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());
            //5. Execultar o comando 
            ps.execute();
            //6. Fechar a conexão
        }
    }
    public List<Evento> listar() throws Exception{
        //1 Construir um objeto ArrayList
        var eventos = new ArrayList<Evento>();
        //2 Especificar comando SQL
        var sql = "SELECT * FROM tb_evento_psc_segunda";
        //3 Estabelecer uma conexão com o banco de dados
        try(
                var conexao =
                        new ConnectionFactory().obterConexao();
            //4 Preparar comando
            //5 Subistituir os eventuais placeholders
                var ps = conexao.prepareStatement(sql);
            //6 Execultar comandos
                var rs = ps.executeQuery();
                
        ){


            //7 Lidar com o resultado
            while(rs.next()){
                //a pegar nome
                var nome = rs.getString("nome");         
                //b pegar descrição
                var descricao = rs.getString("descricao");               
                //c pegar data inicio
                var dataIncio =
                        new java.util.Date(rs.getDate("data_incio"). getTime());
                                                           
                //d pegar data termino
                var dataTermino =
                        new java.util.Date(rs.getDate("data_termino").getTime());
                                                            
                //e construir um objeto Evento
                var e = new Evento();
                //f atribuir os valores a ele com seus setters
                e.setNome(nome);
                e.setDescricao(descricao);
                e.setDataInicio(dataIncio);
                e.setDataTermino(dataTermino);
                //g adicionar o Evento à lista de eventos
                eventos.add(e);
            }
                return eventos;
            //8 Fechar recursos: Já foi feito pelo try-with-resources
        }
    }
}
