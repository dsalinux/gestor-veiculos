package br.edu.iftm.veiculos.logic;

import br.edu.iftm.veiculos.entity.Usuario;
import java.io.Serializable;
import java.util.List;

public interface GenericLogic<E> extends Serializable{
    //Inserir e atualizar
    public void salvar(E entidade);
    public void deletar(E entidade);
    public List<E> listar();
    
}
