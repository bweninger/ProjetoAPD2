/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.ReservaQuarto;

/**
 *
 * @author BWeninger
 */
public class ReservaHotelFactory extends AbstractEntityFactory<ReservaQuarto> {
    
    private static final ReservaHotelFactory INSTANCE = new ReservaHotelFactory();
    
    private ReservaHotelFactory(){
        super(ReservaQuarto.class);
    }
    
    public static ReservaHotelFactory getInstance(){
        return INSTANCE;
    }
    
}
