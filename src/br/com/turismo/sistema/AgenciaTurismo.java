package br.com.turismo.sistema;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BWeninger
 */
public class AgenciaTurismo {
    
    private static final AgenciaTurismo SISTEMA = new AgenciaTurismo();
            
    private AgenciaTurismo(){
        super();
    }
    
   public static AgenciaTurismo getInstance(){
       return AgenciaTurismo.SISTEMA;
   } 
    
    public void exibirMenuUsuario(){
        
    }
}
