/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Agenda;
import entity.Cliente;
import entity.Servico;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import view.IAgendaDAO;

/**
 *
 * @author douglas
 */
public class AgendaDAO implements IAgendaDAO {
    
    @Override
    public int save(Agenda agenda) {
        
        String sql = "INSERT INTO agenda(cliente_id,servico_id,data,horario)"
                + " VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            Date oDate = agenda.getData();        
            DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String szDate = oDateFormat.format(oDate);
            pstm = conn.prepareStatement(sql);
            

            pstm.setLong(1, agenda.getCliente().getId());
            pstm.setLong(2, agenda.getServico().getId());
            pstm.setDate(3, java.sql.Date.valueOf(szDate));
            pstm.setString(4, agenda.getHorario());

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
    public int update(Agenda agenda) {
        String sql = "UPDATE agenda SET cliente_id = ?, servico_id = ?, data = ?, horario = ?"
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            
            conn = dao.ConectionFactory.Conexao();
            Date oDate = agenda.getData();        
            DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String szDate = oDateFormat.format(oDate);
            pstm = conn.prepareStatement(sql);
            
            pstm.setLong(1, agenda.getCliente().getId());
            pstm.setLong(2, agenda.getServico().getId());
            pstm.setDate(3, java.sql.Date.valueOf(szDate));
            pstm.setString(4, agenda.getHorario());
            pstm.setLong(5, agenda.getId());
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
        String sql = "DELETE FROM agenda WHERE id = ?";

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
    public List<Agenda> findAll() {
        String sql = "SELECT * FROM agenda ORDER BY horario ASC";

        ArrayList<Agenda> agendas = new ArrayList<Agenda>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Agenda agenda = new Agenda();
                Cliente cliente = new Cliente();
                Servico servico = new Servico();
                ClienteDAO clienteDAO = new ClienteDAO();
                ServicoDAO servicoDAO = new ServicoDAO();
                
                
                cliente = (Cliente) clienteDAO.filterClienteId(rset.getLong("cliente_id"));
                servico = (Servico) servicoDAO.filterServicoId(rset.getLong("servico_id"));
                agenda.setId(rset.getLong("id"));
                agenda.setCliente(cliente);
                agenda.setServico(servico);
                agenda.setData(rset.getDate("data"));
                agenda.setHorario(rset.getString("horario"));

                agendas.add(agenda);
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
        return agendas;
    }
    
    @Override
    public List<Agenda> filterAgenda(Date data) {
        String sql = "SELECT * FROM agenda WHERE data = ? ORDER BY horario ASC";

        ArrayList<Agenda> agendas = new ArrayList<Agenda>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            Date oDate = data;
            DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String szDate = oDateFormat.format(oDate);
            pstm = conn.prepareStatement(sql);
            pstm.setDate(1, java.sql.Date.valueOf(szDate));
            rset = pstm.executeQuery();

            while (rset.next()) {

                Agenda agenda = new Agenda();
                Cliente cliente = new Cliente();
                Servico servico = new Servico();
                ClienteDAO clienteDAO = new ClienteDAO();
                ServicoDAO servicoDAO = new ServicoDAO();
                
                cliente = (Cliente) clienteDAO.filterClienteId(rset.getLong("cliente_id"));
                servico = (Servico) servicoDAO.filterServicoId(rset.getLong("servico_id"));
                agenda.setId(rset.getLong("id"));
                agenda.setCliente(cliente);
                agenda.setServico(servico);
                agenda.setData(rset.getDate("data"));
                agenda.setHorario(rset.getString("horario"));

                agendas.add(agenda);
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
        return agendas;
    }
    
    @Override
    public List<Agenda> filterAgendaPeriodo(Date data, Date data2) {
        String sql = "SELECT * FROM agenda WHERE data BETWEEN ? AND ? ORDER BY data ASC";

        ArrayList<Agenda> agendas = new ArrayList<Agenda>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConectionFactory.Conexao();
            Date oDate = data;
            DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String szDate = oDateFormat.format(oDate);
            Date oDate2 = data2;
            DateFormat oDate2Format = new SimpleDateFormat("yyyy-MM-dd");
            String sz2Date = oDate2Format.format(oDate2);
            pstm = conn.prepareStatement(sql);
            pstm.setDate(1, java.sql.Date.valueOf(szDate));
            pstm.setDate(2, java.sql.Date.valueOf(sz2Date));
            rset = pstm.executeQuery();

            while (rset.next()) {

                Agenda agenda = new Agenda();
                Cliente cliente = new Cliente();
                Servico servico = new Servico();
                ClienteDAO clienteDAO = new ClienteDAO();
                ServicoDAO servicoDAO = new ServicoDAO();
                
                cliente = (Cliente) clienteDAO.filterClienteId(rset.getLong("cliente_id"));
                servico = (Servico) servicoDAO.filterServicoId(rset.getLong("servico_id"));
                agenda.setId(rset.getLong("id"));
                agenda.setCliente(cliente);
                agenda.setServico(servico);
                agenda.setData(rset.getDate("data"));
                agenda.setHorario(rset.getString("horario"));

                agendas.add(agenda);
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
        return agendas;
    }
}
