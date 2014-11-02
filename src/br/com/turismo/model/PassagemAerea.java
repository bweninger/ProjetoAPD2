/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

/**
 *
 * @author BWeninger
 */
public class PassagemAerea extends Reserva{
    
    private Voo voo;

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }    

    @Override
    public String reservar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean cancelarReserva() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean modificarReserva() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
