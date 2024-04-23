/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela.persistencia;

import br.com.ifreela.ifreela.modelo.Evento;


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
}

