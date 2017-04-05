/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Estoque;
import facade.EstoqueFacade;
import java.util.List;

/**
 *
 * @author douglas
 */
public class EstoqueController {
    private EstoqueFacade facade;

    public EstoqueController() {
        this.facade = new EstoqueFacade();
    }
    
    public int addEstoque(Estoque estoque){
        return facade.save(estoque);
    }
    
    public int editarEstoque(Estoque estoque){
        return facade.update(estoque);
    }
    
    public int excluirEstoque(Long id){
        return facade.remove(id);
    }
    
    public List<Estoque> findEstoque(){
        return facade.findAll();
    }
    
    public List<Estoque> filterEstoque(String nome){
        return facade.filterEstoque(nome);
    }   
}