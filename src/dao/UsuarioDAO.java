/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import view.IUsuarioDAO;

/**
 *
 * @author douglas
 */
public class UsuarioDAO implements IUsuarioDAO {

    @Override
    public int save(Usuario usuario) {

        String sql = "INSERT INTO usuarios(nome,login,senha)"
                + " VALUES(?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getLogin());
            pstm.setString(3, usuario.getSenha());

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int update(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ?"
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getLogin());
            pstm.setString(3, usuario.getSenha());
            pstm.setLong(4, usuario.getId());

            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int remove(Long id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = dao.ConectionFactory.Conexao();

            pstm = conn.prepareStatement(sql);

            pstm.setLong(1, id);

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public List<Usuario> findAll() {
        String sql = "SELECT * FROM usuarios ORDER BY nome ASC";

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(rset.getLong("id"));
                usuario.setNome(rset.getString("nome"));
                usuario.setLogin(rset.getString("login"));
                usuario.setSenha(rset.getString("senha"));

                usuarios.add(usuario);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            try {

                if (rset != null) {

                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return usuarios;
    }

    @Override
    public Usuario login(String login, String senha) {
        String sql = "SELECT * FROM usuarios WHERE login=? AND senha=?";

        Usuario usuario = null;
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = dao.ConectionFactory.Conexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, login);
            ps.setObject(2, senha);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return usuario;
    }

}
