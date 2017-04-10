/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import view.IServicoDAO;
import entity.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author douglas
 */
public class ServicoDAO implements IServicoDAO {
    
    @Override
    public int save(Servico servico) {
        
        String sql = "INSERT INTO servico(nome)"
                + " VALUES(?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, servico.getNome());

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
    public int update(Servico servico) {
        String sql = "UPDATE servico SET nome = ?"
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, servico.getNome());
            pstm.setLong(2, servico.getId());
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
    public int remove(Long id)throws Exception {
        String sql = "DELETE FROM servico WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = dao.ConectionFactory.Conexao();

            pstm = conn.prepareStatement(sql);

            pstm.setLong(1, id);

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Serviço não pode ser removido pois já está sendo usado em um agendamento!");
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
    public List<Servico> findAll() {
        String sql = "SELECT * FROM servico ORDER BY UPPER(nome) ASC";

        ArrayList<Servico> servicos = new ArrayList<Servico>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Servico servico = new Servico();

                servico.setId(rset.getLong("id"));
                servico.setNome(rset.getString("nome"));

                servicos.add(servico);
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
        return servicos;
    }
    
    @Override
    public List<Servico> filterServico(String nome) {
        String sql = "SELECT * FROM servico WHERE nome ilike ? ORDER BY UPPER(nome) ASC";

        ArrayList<Servico> servicos = new ArrayList<Servico>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + nome + "%");
            rset = pstm.executeQuery();

            while (rset.next()) {

                Servico servico = new Servico();

                servico.setId(rset.getLong("id"));
                servico.setNome(rset.getString("nome"));

                servicos.add(servico);
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
        return servicos;
    }
    
    @Override
    public Servico filterServicoId(Long id) {
        String sql = "SELECT * FROM servico WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        Servico servico = new Servico();

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, id);
            rset = pstm.executeQuery();

            while (rset.next()) {

                

                servico.setId(rset.getLong("id"));
                servico.setNome(rset.getString("nome"));
                
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
        return servico;
    }
}
