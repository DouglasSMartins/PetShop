/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import view.IEstoqueDAO;
import entity.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author douglas
 */
public class EstoqueDAO implements IEstoqueDAO {
    
    @Override
    public int save(Estoque estoque) {
        
        String sql = "INSERT INTO estoque(nome,quantidade)"
                + " VALUES(?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, estoque.getNome());
            pstm.setInt(2, estoque.getQuantidade());

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
    public int update(Estoque estoque) {
        String sql = "UPDATE estoque SET nome = ?, quantidade = ?"
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, estoque.getNome());
            pstm.setInt(2, estoque.getQuantidade());
            pstm.setLong(3, estoque.getId());
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
        String sql = "DELETE FROM estoque WHERE id = ?";

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
    public List<Estoque> findAll() {
        String sql = "SELECT * FROM estoque ORDER BY UPPER(nome) ASC";

        ArrayList<Estoque> estoques = new ArrayList<Estoque>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Estoque estoque = new Estoque();

                estoque.setId(rset.getLong("id"));
                estoque.setNome(rset.getString("nome"));
                estoque.setQuantidade(rset.getInt("quantidade"));

                estoques.add(estoque);
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
        return estoques;
    }
    
    @Override
    public List<Estoque> filterEstoque(String nome) {
        String sql = "SELECT * FROM estoque WHERE nome ilike ? ORDER BY UPPER(nome) ASC";

        ArrayList<Estoque> estoques = new ArrayList<Estoque>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + nome + "%");
            rset = pstm.executeQuery();

            while (rset.next()) {

                Estoque estoque = new Estoque();

                estoque.setId(rset.getLong("id"));
                estoque.setNome(rset.getString("nome"));
                estoque.setQuantidade(rset.getInt("quantidade"));

                estoques.add(estoque);
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
        return estoques;
    }
}