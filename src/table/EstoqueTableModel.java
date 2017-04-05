/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import entity.Estoque;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author douglas
 */
public class EstoqueTableModel extends AbstractTableModel{
    
    private static final int COL_NOME=0;
    private static final int COL_QUANTIDADE=1;
    
    private List<Estoque> estoques;

    public EstoqueTableModel(List<Estoque> estoques) {
        this.estoques = estoques;
    }
    
    public int getRowCount() {
        return estoques.size();
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Estoque estoque = estoques.get(rowIndex);
        
        if(columnIndex == COL_NOME){
            return estoque.getNome();
        } else if(columnIndex == COL_QUANTIDADE){
            return estoque.getQuantidade();
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
            case COL_QUANTIDADE:
                coluna = "Quantidade";
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
        } else if(columnIndex == COL_QUANTIDADE){
            return String.class;
        } 
        return null;
    }
    
    public Estoque get(int row){
        return estoques.get(row);
    }   
}