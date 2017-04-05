/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import entity.Servico;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author douglas
 */
public class ServicoTableModel extends AbstractTableModel {
    private static final int COL_NOME=0;
    
    private List<Servico> servicos;

    public ServicoTableModel(List<Servico> servicos) {
        this.servicos = servicos;
    }
    
    public int getRowCount() {
        return servicos.size();
    }

    public int getColumnCount() {
        return 1;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Servico servico = servicos.get(rowIndex);
        
        if(columnIndex == COL_NOME){
            return servico.getNome();
        }  
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        switch (column){
            case COL_NOME:
                coluna = "Nome";
                break;
            default:
                throw new IllegalArgumentException("Coluna invalida!");           
        }
        return coluna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        if(columnIndex == COL_NOME){
            return String.class;
        }
        return null;
    }
    
    public Servico get(int row){
        return servicos.get(row);
    }
    
}
