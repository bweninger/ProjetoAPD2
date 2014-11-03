/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BWeninger
 */
public class HotelFactory extends AbstractEntityFactory<Hotel> {
    
    private static final HotelFactory INSTANCE = new HotelFactory();
    
    private HotelFactory(){
        super(Hotel.class);
    }
    
    public static HotelFactory getInstance(){
        return INSTANCE;
    }
    
    public List<Hotel> buscarHoteis(){
        return this.entidades;
    }
    
    /*public Hotel buscarHotelPorLocal(String cpf){
        for(Cliente cliente : this.entidades){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }*/
    
}
