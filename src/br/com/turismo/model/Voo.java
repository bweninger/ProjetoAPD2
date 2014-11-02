/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

import java.util.List;

/**
 *
 * @author BWeninger
 */
public class Voo {
    
    private String origem;
    private String destino;
    private List<Assento> assentos;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }  
    
}
