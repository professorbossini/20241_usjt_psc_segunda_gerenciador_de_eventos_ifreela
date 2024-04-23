/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_segunda_projeto_eventos.persistencia;

import br.com.bossini._usjt_psc_segunda_projeto_eventos.modelo.Evento;

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
}
