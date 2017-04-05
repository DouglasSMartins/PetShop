/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.AgendaDAO;
import entity.Agenda;
import java.util.Date;
import java.util.List;
import view.IAgendaDAO;

/**
 *
 * @author douglas
 */
public class AgendaFacade {
    
    private IAgendaDAO dao;

    public AgendaFacade() {
        this.dao = new AgendaDAO();
    }
    
    public int save(Agenda agenda){
        return dao.save(agenda);
    }
    
    public int update(Agenda agenda){
        return dao.update(agenda);
    }
    
    public int remove(Long id){
        return dao.remove(id);
    }
    
    public List<Agenda> findAll(){
        return dao.findAll();
    }
    
    public List<Agenda> filterAgenda(Date data){
        return dao.filterAgenda(data);
    }
}
