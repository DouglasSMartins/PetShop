/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import view.IServicoDAO;
import dao.ServicoDAO;
import entity.Servico;
import java.util.List;

/**
 *
 * @author douglas
 */
public class ServicoFacade {
    
    private IServicoDAO dao;

    public ServicoFacade() {
        this.dao = new ServicoDAO();
    }
    
    public int save(Servico servico){
        return dao.save(servico);
    }
    
    public int update(Servico servico){
        return dao.update(servico);
    }
    
    public int remove(Long id)throws Exception{
        return dao.remove(id);
    }
    
    public List<Servico> findAll(){
        return dao.findAll();
    }
    
    public List<Servico> filterServico(String nome){
        return dao.filterServico(nome);
    }
    
    public Servico filterServicoId(Long id){
        return dao.filterServicoId(id);
    }
}