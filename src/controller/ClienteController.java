/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Cliente;
import facade.ClienteFacade;
import java.util.List;

/**
 *
 * @author douglas
 */
public class ClienteController {
    
    private ClienteFacade facade;

    public ClienteController() {
        this.facade = new ClienteFacade();
    }
    
    public int addCliente(Cliente cliente){
        return facade.save(cliente);
    }
    
    public int editarCliente(Cliente cliente){
        return facade.update(cliente);
    }
    
    public int excluirCliente(Long id){
        return facade.remove(id);
    }
    
    public List<Cliente> findClientes(){
        return facade.findAll();
    }
    
    public List<Cliente> filterClientes(String nome, String cpf){
        return facade.filterCliente(nome,cpf);
    }
    
    public Cliente filterClienteId(Long id){
        return facade.filterClienteId(id);
    }
}
