/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.EstoqueDAO;
import view.IEstoqueDAO;
import entity.Estoque;
import java.util.List;

/**
 *
 * @author douglas
 */
public class EstoqueFacade {
    private IEstoqueDAO dao;

    public EstoqueFacade() {
        this.dao = new EstoqueDAO();
    }
    
    public int save(Estoque estoque){
        return dao.save(estoque);
    }
    
    public int update(Estoque estoque){
        return dao.update(estoque);
    }
    
    public int remove(Long id){
        return dao.remove(id);
    }
    
    public List<Estoque> findAll(){
        return dao.findAll();
    }
    
    public List<Estoque> filterEstoque(String nome){
        return dao.filterEstoque(nome);
    }
    
}
