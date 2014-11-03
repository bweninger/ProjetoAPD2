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
public class ReservaQuarto extends Reserva {

    private Quarto quarto;
    protected Date dataInicio;
    protected Date dataFim;

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
