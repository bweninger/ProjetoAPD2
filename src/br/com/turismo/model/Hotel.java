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
public class Hotel {
    
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private double classificacao;    
    private List<Quarto> quartos;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }    
}
