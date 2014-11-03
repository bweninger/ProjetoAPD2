/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

/**
 *
 * @author BWeninger
 */
public abstract class Reserva {
    
    protected StatusReserva statusReserva;
    
    public abstract String reservar();
    
    public abstract boolean cancelarReserva();
    
    public abstract boolean modificarReserva();
    
}
