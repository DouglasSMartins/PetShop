/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Servico;
import java.util.List;

/**
 *
 * @author douglas
 */
public interface IServicoDAO {
    
    int save(Servico servico);
    
    int update(Servico servico);
    
    int remove(Long id)throws Exception;
    
    List<Servico> findAll();
    
    List<Servico> filterServico(String nome);
    
    Servico filterServicoId(Long id);
}