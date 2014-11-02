/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Cliente;
import br.com.turismo.model.Pacote;

/**
 *
 * @author BWeninger
 */
public class PacoteFactory extends AbstractEntityFactory<Pacote>{
    
     private static final PacoteFactory INSTANCE = new PacoteFactory();
    
    private PacoteFactory(){
        super(Pacote.class);
    }
    
    public static PacoteFactory getInstance(){
        return INSTANCE;
    }
    
    public Pacote buscarPacotePorCliente(Cliente cliente){
        for(Pacote pacote : this.entidades){
            if(cliente.getCpf().equals(pacote.getCliente().getCpf())){
                return pacote;
            }
        }
        return null;
    }
    
}
