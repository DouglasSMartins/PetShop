/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Cliente;
import java.util.List;

/**
 *
 * @author douglas
 */
public interface IClienteDAO {
    
    int save(Cliente cliente);
    
    int update(Cliente cliente);
    
    int remove(Long id);
    
    List<Cliente> findAll();
    
    List<Cliente> filterCliente(String nome, String cpf);
    
    Cliente filterClienteId(Long id);
}
