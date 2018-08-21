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
public class DAOCliente {
    
    public List<Cliente> getLista(){
        return Dados.listaCliente;
    }
    
    public boolean salvar(Cliente obj){
        if(obj.getNome() == null){
            String nome = Integer.toString(Dados.listaCliente.size() + 1);
            obj.setNome(nome);
            Dados.listaCliente.add(obj);
        }
        return true;
    }
    public boolean remover(Cliente obj){
        Dados.listaCliente.remove(obj);
        return true;
    }
}
