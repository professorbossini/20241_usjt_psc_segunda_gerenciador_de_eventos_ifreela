/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela.persistencia;

import br.com.ifreela.ifreela.modelo.Usuario;
import br.com.ifreela.ifreela.persistencia.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 82329522
 */
public class UsuarioDAO {
    public Usuario existe(Usuario u) throws Exception{
        //1 Especificar o comando SQL
        String sql = "SELECT * FROM tb_usuario_psc_segunda WHERE login = ? AND senha = ?";
        //2 Estabelecer uma conexão com o banco de dados
        Connection conexao = new ConnectionFactory().obterConexao();
        //3 Preparar o comando SQL
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4 subistituir os eventuais placeholders
        ps.setString(1, u.getLogin());
        ps.setString(2, u.getSenha());
        //5 Executar o codigo
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            int tipo = rs.getInt("tipo_usuario");
            u.setTipoUsuario(tipo);
            return u;
        }
        else{
            return null;
        }
        //6 Devolver um valor boleano de acordo com o resultado
//        if(rs.next()){
//            return true;
//        }
//           return rs.next() ? true : false;
           
             //depois veremos como fechar a conexão
             //usando um try-with-resources
    }
}

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    private Connection conexao;

    public UsuarioDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean existe(Usuario usuario) {
        boolean usuarioExiste = false;
        String query = "SELECT COUNT(*) FROM tb_usuario_psc_segunda WHERE login = ? AND senha = ?";

        try (PreparedStatement ps = conexao.prepareStatement(query)) {
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    usuarioExiste = count > 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarioExiste;
    }
}*/


