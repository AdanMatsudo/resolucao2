/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Matsudo
 */
public class DAOPais {
    
    public List<Pais> getLista(){
        return Dados.listaPais;
    }
    
    public boolean salvar(Pais obj){
        if (obj.getCodigo() == null){  //verifica se ta vazia
            Integer codigo = Dados.listaPais.size() +1;
            obj.setCodigo(codigo);
            Dados.listaPais.add(obj);
        }
        return true;
    }
    
    public boolean remover(Pais obj){
        Dados.listaPais.remove(obj);
        return true;
    }
}
