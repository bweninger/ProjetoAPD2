/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

/**
 *
 * @author BWeninger
 */
public class Quarto {
    
    private String identificador;
    private TipoQuarto tipoQuarto;

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return this.identificador + " - " + this.tipoQuarto.name() + " (R$ " + this.tipoQuarto.getPreco() + ")";
    }
    
    
}
