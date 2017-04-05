/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Servico;
import facade.ServicoFacade;
import java.util.List;

/**
 *
 * @author douglas
 */
public class ServicoController {
    private ServicoFacade facade;

    public ServicoController() {
        this.facade = new ServicoFacade();
    }
    
    public int addServico(Servico servico){
        return facade.save(servico);
    }
    
    public int editarServico(Servico servico){
        return facade.update(servico);
    }
    
    public int excluirServico(Long id){
        return facade.remove(id);
    }
    
    public List<Servico> findServico(){
        return facade.findAll();
    }
    
    public List<Servico> filterServico(String nome){
        return facade.filterServico(nome);
    }
    
    public Servico filterServicoId(Long id){
        return facade.filterServicoId(id);
    }
}
