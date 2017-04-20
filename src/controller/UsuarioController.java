/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Usuario;
import facade.UsuarioFacade;
import java.util.List;

/**
 *
 * @author douglas
 */
public class UsuarioController {

    private UsuarioFacade facade;

    public UsuarioController() {
        this.facade = new UsuarioFacade();
    }

    public int addUsuario(Usuario usuario) {
        return facade.save(usuario);
    }

    public int editarUsuario(Usuario usuario) {
        return facade.update(usuario);
    }

    public int excluirUsuario(Long id) {
        return facade.remove(id);
    }

    public List<Usuario> findUsuario() {
        return facade.findAll();
    }

    public Usuario login(String login, String senha) {
        return facade.login(login, senha);
    }

}
