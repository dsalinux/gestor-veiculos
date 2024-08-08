package br.edu.iftm.veiculos.dao;

import br.edu.iftm.veiculos.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Long>{

    @Override
    public Class<Usuario> getClasseEntidade() {
        return Usuario.class;
    }
    
}
