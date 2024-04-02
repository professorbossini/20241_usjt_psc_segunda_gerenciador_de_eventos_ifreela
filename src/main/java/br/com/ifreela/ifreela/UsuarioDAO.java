/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifreela.ifreela;

/**
 *
 * @author 82329522
 */
/*public class UsuarioDAO {
    public boolean existe(Usuario u){
        
    }
}*/

import java.sql.Connection;
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
}


