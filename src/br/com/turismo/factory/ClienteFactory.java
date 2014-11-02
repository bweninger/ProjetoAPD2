/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Cliente;

/**
 *
 * @author BWeninger
 */
public class ClienteFactory extends AbstractEntityFactory<Cliente> {
    
    private static final ClienteFactory INSTANCE = new ClienteFactory();
    
    private ClienteFactory(){
        super(Cliente.class);
    }
    
    public static ClienteFactory getInstance(){
        return INSTANCE;
    }
    
    public Cliente buscarClientePorCPF(String cpf){
        for(Cliente cliente : this.entidades){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }
    
}
