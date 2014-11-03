/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Assento;

/**
 *
 * @author BWeninger
 */
public class AssentoFactory extends AbstractEntityFactory<Assento> {
    
     private static final AssentoFactory INSTANCE = new AssentoFactory();
    
    private AssentoFactory(){
        super(Assento.class);
    }
    
    public static AssentoFactory getInstance(){
        return INSTANCE;
    }
}
