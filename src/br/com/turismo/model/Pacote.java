/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

/**
 *
 * @author BWeninger
 */
public class Pacote {
    
    private Cliente cliente;
    
    private String eTicket;
    
    private Reserva reservaQuarto;
    
    private Reserva passagemAerea;

    public Reserva getReservaQuarto() {
        return reservaQuarto;
    }

    public void setReservaQuarto(Reserva reservaQuarto) {
        this.reservaQuarto = reservaQuarto;
    }

    public Reserva getPassagemAerea() {
        return passagemAerea;
    }

    public void setPassagemAerea(Reserva passagemAerea) {
        this.passagemAerea = passagemAerea;
    }    

    public String geteTicket() {
        return eTicket;
    }

    public void seteTicket(String eTicket) {
        this.eTicket = eTicket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }    
}
