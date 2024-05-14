/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;

import br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public class EventoDAO {
    public void cadastrar(Evento e) throws Exception{
        //1. Especificar o comando SQL (INSERT)
        var sql = "INSERT INTO tb_evento_psc_segunda (nome, descricao) VALUES(?, ?)";
        //try-with-resources
        //2. Abrir uma conexão com o banco
        try(var conexao = new ConnectionFactory().obterConexao()){
            //3. Preparar o comando
            var ps = conexao.prepareStatement(sql);
            //4. Substituir os eventuais placeholders
            ps.setString(1, e.getNome());
            ps.setString(2, e.getDescricao());
            //5. Executar o comando
            ps.execute();
            //6. Fechar a conexão
            //já foi feito pelo try-with-resources
        }
    }
    
    public List<Evento> listar() throws Exception{
        //1. Construir um objeto ArrayList
        var eventos = new ArrayList<Evento>();
        //2. Especificar o comando SQL
        var sql = "SELECT * FROM tb_evento_psc_segunda";
        try(
            //3. Estabelecer uma conexão com o banco
            var conexao = 
                    new ConnectionFactory().obterConexao();
            //4. Preparar o comando
            //5. Substituir os eventuais placeholders
            var ps = conexao.prepareStatement(sql);
            //6. Executar o comando
            var rs = ps.executeQuery();
        ){
            //7. Lidar com o resultado
            while(rs.next()){
                //a. pegar o nome
                var nome = rs.getString("nome");
                //b. pegar a descrição
                var descricao = rs.getString("descricao");
                //c. pegar a data inicio
                var dataInicio = new java.util.Date(
                    rs.getDate("data_inicio").getTime()
                );
                //d. pegar a data termino
                var dataTermino = new java.util.Date(
                    rs.getDate("data_termino").getTime()
                );
                //e. construir um objeto Evento
                var e = new Evento();
                //f. atribuir os valores a ele com seus setters
                e.setNome(nome);
                e.setDescricao(descricao);
                e.setDataInicio(dataInicio);
                e.setDataTermino(dataTermino);
                //g. adicionar o Evento à lista de eventos
                eventos.add(e);
            }
            return eventos;
            //8. Fechar os recursos: Já foi feito pelo try-with-resources
        }
    }
}
