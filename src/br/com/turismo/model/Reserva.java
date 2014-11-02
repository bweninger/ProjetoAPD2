/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

import java.util.Date;

/**
 *
 * @author BWeninger
 */
public abstract class Reserva {
    
    protected Date dataHora;
    
    protected StatusReserva statusReserva;
    
    public abstract String reservar();
    
    public abstract boolean cancelarReserva();
    
    public abstract boolean modificarReserva();
    
}
