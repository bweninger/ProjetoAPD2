/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Voo;

/**
 *
 * @author BWeninger
 */
public class VooFactory extends AbstractEntityFactory<Voo> {
    
    private static final VooFactory INSTANCE = new VooFactory();
    
    private VooFactory() {
        super(Voo.class);
    }
    
    public static VooFactory getInstance(){
        return INSTANCE;
    }
    
    
    
}
