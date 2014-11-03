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
public class PassagemAerea extends Reserva{
    
    private Voo voo;

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public StatusReserva getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(StatusReserva statusReserva) {
        this.statusReserva = statusReserva;
    }

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
