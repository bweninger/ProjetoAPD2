/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Quarto;

/**
 *
 * @author BWeninger
 */
public class QuartoFactory extends AbstractEntityFactory<Quarto> {
    
    private static final QuartoFactory INSTANCE = new QuartoFactory();
    
    private QuartoFactory(){
        super(Quarto.class);
    }
    
    public static QuartoFactory getInstance(){
        return INSTANCE;
    }
    
    
}
