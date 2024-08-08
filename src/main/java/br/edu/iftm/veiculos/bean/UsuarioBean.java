package br.edu.iftm.veiculos.bean;

import br.edu.iftm.veiculos.entity.Permissao;
import br.edu.iftm.veiculos.entity.Usuario;
import br.edu.iftm.veiculos.logic.GenericLogic;
import br.edu.iftm.veiculos.logic.UsuarioLogic;
import br.edu.iftm.veiculos.util.EntityManagerProducer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import lombok.Getter;

@Named
@SessionScoped
public class UsuarioBean extends GenericBean<Usuario, UsuarioLogic>{
    
    @Inject
    private UsuarioLogic usuarioLogic;

    @Override
    public Class<Usuario> getClasseEntidade() {
        return Usuario.class;
    }
    
    @Override
    public UsuarioLogic getLogic() {
        return usuarioLogic;
    }
    
}
