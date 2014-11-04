/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.factory;

import br.com.turismo.model.Voo;
import java.util.List;

/**
 *
 * @author BWeninger
 */
public class VooFactory extends AbstractEntityFactory<Voo> {
    
    private static final VooFactory INSTANCE = new VooFactory();
    
    private VooFactory() {
        super(Voo.class);
    }
    
    public static VooFactory getInstance(){
        return INSTANCE;
    }
    
    public List<Voo> buscarVoos(){
        return this.entidades;
    }
    
    public Voo buscarVooPorIndice(int i){
        if(i > entidades.size() || i <= 0){
            return null;
        }else{
            return entidades.get(i - 1);
        }
    }
    
}
