/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ClienteDAO;
import view.IClienteDAO;
import entity.Cliente;
import java.util.List;

/**
 *
 * @author douglas
 */
public class ClienteFacade {
    
    private IClienteDAO dao;

    public ClienteFacade() {
        this.dao = new ClienteDAO();
    }
    
    public int save(Cliente cliente){
        return dao.save(cliente);
    }
    
    public int update(Cliente cliente){
        return dao.update(cliente);
    }
    
    public int remove(Long id)throws Exception{
        return dao.remove(id);
    }
    
    public List<Cliente> findAll(){
        return dao.findAll();
    }
    
    public List<Cliente> filterCliente(String nome, String cpf){
        return dao.filterCliente(nome,cpf);
    }
    
    public Cliente filterClienteId(Long id){
        return dao.filterClienteId(id);
    }
}
