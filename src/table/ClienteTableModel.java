/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import entity.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author douglas
 */
public class ClienteTableModel extends AbstractTableModel {
    
    //private static final int COL_ID=0;
    private static final int COL_NOME=0;
    private static final int COL_CPF=1;
    private static final int COL_CELULAR=2;
    private static final int COL_TELEFONE=3;
    private static final int COL_LOGRADOURO=4;
    //private static final int COL_NUMERO=5;
    private static final int COL_BAIRRO=5;
    private static final int COL_CIDADE=6;
    //private static final int COL_ESTADO=8;
    
    private List<Cliente> clientes;

    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
    public int getRowCount() {
        return clientes.size();
    }

    public int getColumnCount() {
        return 7;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        /**if(columnIndex == COL_ID){
            return cliente.getId();
        } else**/ if(columnIndex == COL_NOME){
            return cliente.getNome();
        } else if(columnIndex == COL_CPF){
            return cliente.getCpf();
        } else if(columnIndex == COL_CELULAR){
            return cliente.getCelular();
        } else if(columnIndex == COL_TELEFONE){
            return cliente.getTelefone();
        } else if(columnIndex == COL_LOGRADOURO){
            return cliente.getLogradouro();
        } /**else if(columnIndex == COL_NUMERO){
            return cliente.getNumero();
        } else**/ if(columnIndex == COL_BAIRRO){
            return cliente.getBairro();
        } else if(columnIndex == COL_CIDADE){
            return cliente.getCidade();
        } /**else if(columnIndex == COL_ESTADO){
            return cliente.getEstado();
        }**/      
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        
        String coluna = "";
        switch (column){
            /**case COL_ID:
                coluna = "Id";
                break;**/
            case COL_NOME:
                coluna = "Nome";
                break;
            case COL_CPF:
                coluna = "Cpf";
                break;
            case COL_CELULAR    :
                coluna = "Celular";
                break;
            case COL_TELEFONE:
                coluna = "Telefone";
                break;
            case COL_LOGRADOURO:
                coluna = "Logradouro";
                break;
            /**case COL_NUMERO:
                coluna = "Nº";
                break;**/
            case COL_BAIRRO:
                coluna = "Bairro";
                break;
            case COL_CIDADE:
                coluna = "Cidade";
                break;
            /**case COL_ESTADO:
                coluna = "Estado";
                break;**/
            default:
                throw new IllegalArgumentException("Coluna invalida!");           
        }
        return coluna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        
        /**if(columnIndex == COL_ID){
            return int.class;
        } else**/ if(columnIndex == COL_NOME){
            return String.class;
        } else if(columnIndex == COL_CPF){
            return String.class;
        } else if(columnIndex == COL_CELULAR){
            return String.class;
        } else if(columnIndex == COL_TELEFONE){
            return String.class;
        } else if(columnIndex == COL_LOGRADOURO){
            return String.class;
        }/** else if(columnIndex == COL_NUMERO){
            return int.class;
        } **/else if(columnIndex == COL_BAIRRO){
            return String.class;
        } else if(columnIndex == COL_CIDADE){
            return String.class;
        } /**else if(columnIndex == COL_ESTADO){
            return String.class;
        }**/
        return null;
    }
    
    public Cliente get(int row){
        return clientes.get(row);
    }
    
}
