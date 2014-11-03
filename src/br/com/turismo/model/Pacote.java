/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BWeninger
 */
public class Pacote {

    private Cliente cliente;
    private String eTicket;
    private List<Reserva> reservasQuarto;
    private List<Reserva> passagensAereas;

    public void adicionarReservaQuarto(ReservaQuarto reserva) {
        if (this.reservasQuarto == null) {
            this.reservasQuarto = new ArrayList<Reserva>();
        }
        reservasQuarto.add(reserva);
    }
    
    public void adicionarPassagemAerea(PassagemAerea passagem) {
        if (this.passagensAereas == null) {
            this.passagensAereas = new ArrayList<Reserva>();
        }
        passagensAereas.add(passagem);
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
