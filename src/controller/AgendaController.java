/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Agenda;
import facade.AgendaFacade;
import java.util.Date;
import java.util.List;

/**
 *
 * @author douglas
 */
public class AgendaController {
    private AgendaFacade facade;

    public AgendaController() {
        this.facade = new AgendaFacade();
    }
    
    public int addAgenda(Agenda agenda){
        return facade.save(agenda);
    }
    
    public int editarAgenda(Agenda agenda){
        return facade.update(agenda);
    }
    
    public int excluirAgenda(Long id){
        return facade.remove(id);
    }
    
    public List<Agenda> findAgenda(){
        return facade.findAll();
    }
    
    public List<Agenda> filterAgenda(Date data){
        return facade.filterAgenda(data);
    }
}
