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
public class CompanhiaAerea {
    
    private String nome;
    private String razaoSocial;
    private String cnpj;
    
    private List<Voo> voos;

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
