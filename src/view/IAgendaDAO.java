/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Agenda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author douglas
 */
public interface IAgendaDAO {
    
    int save(Agenda agenda);
    
    int update(Agenda agenda);
    
    int remove(Long id);
    
    List<Agenda> findAll();
    
    List<Agenda> filterAgenda(Date data);
    
    List<Agenda> filterAgendaPeriodo(Date data, Date data2);
    
}
