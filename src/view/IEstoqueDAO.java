/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entity.Estoque;
import java.util.List;

/**
 *
 * @author douglas
 */
public interface IEstoqueDAO {
    
    int save(Estoque estoque);
    
    int update(Estoque estoque);
    
    int remove(Long id);
    
    List<Estoque> findAll();
    
    List<Estoque> filterEstoque(String nome);
}