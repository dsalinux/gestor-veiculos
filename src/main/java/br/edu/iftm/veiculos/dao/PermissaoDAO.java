package br.edu.iftm.veiculos.dao;

import br.edu.iftm.veiculos.entity.Permissao;
import br.edu.iftm.veiculos.entity.Usuario;

public class PermissaoDAO extends GenericDAO<Permissao, Long>{

    @Override
    public Class<Permissao> getClasseEntidade() {
        return Permissao.class;
    }
    
}
