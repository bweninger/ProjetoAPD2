/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author BWeninger
 */
public class Voo {
    
    private String origem;
    private String destino;
    private List<Assento> assentos;
    private Date data;

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
    
    public List<Assento> getAssentos(){
        return assentos;
    }
    
    public void adicionaAssento(Assento a){
        this.assentos.add(a);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
