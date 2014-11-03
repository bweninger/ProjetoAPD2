/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.PassagemAerea;

/**
 *
 * @author BWeninger
 */
public class PassagemAereaFactory extends AbstractEntityFactory<PassagemAerea> {
    
    private static final PassagemAereaFactory INSTANCE = new PassagemAereaFactory();
    
    private PassagemAereaFactory(){
        super(PassagemAerea.class);
    }
    
    public static PassagemAereaFactory getInstance(){
        return INSTANCE;
    }
    
}
