/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.model;

/**
 *
 * @author BWeninger
 */
public enum TipoQuarto {
    
    CAMA_SIMPLES(40.0), CAMA_QUEEN_SIZE(60.0), CAMA_KING_SIZE(80.0), DUAS_CAMAS(90.0), PRESIDENCIAL(350.0);
    
    private double preco;
    
    TipoQuarto(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
}
