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
public class ClienteFactory extends EntityFactory<Cliente> {
    
    private static final ClienteFactory instance = new ClienteFactory();
    
    private ClienteFactory(){
        super(Cliente.class);
    }
    
    public static ClienteFactory getInstance(){
        return instance;
    }
    
}
