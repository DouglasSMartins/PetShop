/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import view.IClienteDAO;
import entity.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author douglas
 */
public class ClienteDAO implements IClienteDAO {

    @Override
    public int save(Cliente cliente) {
        
        String sql = "INSERT INTO cliente(nome,cpf,celular,telefone,logradouro,numero,bairro,cidade,estado)"
                + " VALUES(?,?,?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getCelular());
            pstm.setString(4, cliente.getTelefone());
            pstm.setString(5, cliente.getLogradouro());
            pstm.setString(6, cliente.getNumero());
            pstm.setString(7, cliente.getBairro());
            pstm.setString(8, cliente.getCidade());
            pstm.setString(9, cliente.getEstado());

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
    public int update(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, celular = ?, telefone = ?, "
                + "logradouro = ?, numero = ?, bairro = ?, cidade = ? , estado = ?"
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getCelular());
            pstm.setString(4, cliente.getTelefone());
            pstm.setString(5, cliente.getLogradouro());
            pstm.setString(6, cliente.getNumero());
            pstm.setString(7, cliente.getBairro());
            pstm.setString(8, cliente.getCidade());
            pstm.setString(9, cliente.getEstado());
            pstm.setLong(10, cliente.getId());

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
    public int remove(Long id)throws Exception{
        String sql = "DELETE FROM cliente WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = dao.ConectionFactory.Conexao();

            pstm = conn.prepareStatement(sql);

            pstm.setLong(1, id);

            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Cliente não pode ser removido pois já está sendo usado em um agendamento!");
            
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
    public List<Cliente> findAll() {
        String sql = "SELECT * FROM cliente ORDER BY UPPER(nome) ASC";

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rset.getLong("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setCelular(rset.getString("celular"));
                cliente.setTelefone(rset.getString("telefone"));
                cliente.setLogradouro(rset.getString("logradouro"));
                cliente.setNumero(rset.getString("numero"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setCidade(rset.getString("cidade"));
                cliente.setEstado(rset.getString("estado"));

                clientes.add(cliente);
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
        return clientes;
    }
    
    @Override
    public List<Cliente> filterCliente(String nome, String cpf) {
        String sql = "SELECT * FROM cliente WHERE nome ilike ? and cpf ilike ? ORDER BY UPPER(nome) ASC";

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + nome + "%");
            pstm.setString(2,"%" + cpf + "%");
            rset = pstm.executeQuery();

            while (rset.next()) {

                Cliente cliente = new Cliente();

                cliente.setId(rset.getLong("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setCelular(rset.getString("celular"));
                cliente.setTelefone(rset.getString("telefone"));
                cliente.setLogradouro(rset.getString("logradouro"));
                cliente.setNumero(rset.getString("numero"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setCidade(rset.getString("cidade"));
                cliente.setEstado(rset.getString("estado"));

                clientes.add(cliente);
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
        return clientes;
    }
    
    @Override
    public Cliente filterClienteId(Long id) {
        String sql = "SELECT * FROM cliente WHERE id = ?";

        Cliente cliente = new Cliente();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            pstm.setLong(1, id);
            rset = pstm.executeQuery();

          
            while (rset.next()) {
                

                cliente.setId(rset.getLong("id"));
                cliente.setNome(rset.getString("nome"));
                cliente.setCpf(rset.getString("cpf"));
                cliente.setCelular(rset.getString("celular"));
                cliente.setTelefone(rset.getString("telefone"));
                cliente.setLogradouro(rset.getString("logradouro"));
                cliente.setNumero(rset.getString("numero"));
                cliente.setBairro(rset.getString("bairro"));
                cliente.setCidade(rset.getString("cidade"));
                cliente.setEstado(rset.getString("estado"));
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
        return cliente;
    }
}