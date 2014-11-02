/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BWeninger
 */
public class Menu extends Opcao{
    
    protected List<Opcao> opcoes;    
    
    @Override
    public Menu selecionar(){        
        return this;
    }
            
    public void exibir(){
        for(Opcao opcao : this.opcoes){
            System.out.println(opcao.getIdOpcao() + ". " + opcao.getDescricao());
        }
        System.out.println("9. Retornar ao menu anterior");
        System.out.println("0. Sair");
    }
    
    public Menu tratarSelecao(int indice){
        for(Opcao opcao : this.opcoes){
            if(opcao.getIdOpcao() == indice){
                Menu result = opcao.selecionar();
                if(result == null){
                    return this;
                }else{
                    return result;
                }
            }
        }
        return null;
    }
    
    public void adicionarOpcao(Opcao opcao){
        if(this.opcoes == null){
            this.opcoes = new ArrayList<Opcao>();
            opcao.setIdOpcao(1);
        }else{
           opcao.setIdOpcao(opcoes.size() + 1);            
        }        
        opcoes.add(opcao);
    }
}
