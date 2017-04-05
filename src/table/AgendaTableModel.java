/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import entity.Agenda;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author douglas
 */
public class AgendaTableModel extends AbstractTableModel {
    
    private static final int COL_DATA=0;
    private static final int COL_HORARIO=1;
    private static final int COL_NOMECLIENTE=2;
    private static final int COL_NOMESERVICO=3;
    
    private List<Agenda> agendas;

    public AgendaTableModel(List<Agenda> agendas) {
        this.agendas = agendas;
    }
    
    public int getRowCount() {
        return agendas.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Agenda agenda = agendas.get(rowIndex);
        Date oDate = agenda.getData();
        DateFormat oDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String szDate = oDateFormat.format(oDate);
        
        if(columnIndex == COL_DATA){
            return szDate;
        } else if(columnIndex == COL_HORARIO){
            return agenda.getHorario();
        } else if(columnIndex == COL_NOMECLIENTE){
            return agenda.getCliente().getNome();
        } else if(columnIndex == COL_NOMESERVICO){
            return agenda.getServico().getNome();
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        switch (column){
            case COL_DATA:
                coluna = "Data";
                break;
            case COL_HORARIO:
                coluna = "Horario";
                break;
            case COL_NOMECLIENTE:
                coluna = "Cliente";
                break;
            case COL_NOMESERVICO:
                coluna = "Serviço";
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida!");           
        }
        return coluna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if(columnIndex == COL_DATA){
            return String.class;
        } else if(columnIndex == COL_HORARIO){
            return String.class;
        } else if(columnIndex == COL_NOMECLIENTE){
            return String.class;
        } else if(columnIndex == COL_NOMESERVICO){
            return String.class;
        } 
        return null;
    }
    
    public Agenda get(int row){
        return agendas.get(row);
    }
    
}
