package br.com.turismo.factory;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BWeninger
 */
public abstract class EntityFactory<T> {
    
    private Class<T> clazz;
    private List<T> entidades;
    
    protected EntityFactory(Class<T> clazz){        
        this.clazz = clazz;
        entidades = new ArrayList<T>();
    }
    
    public T criar() throws InstantiationException, IllegalAccessException{
        if(entidades == null){
            entidades = new ArrayList<T>();
        }
        T t = clazz.newInstance();
        entidades.add(t);
        return t;        
    }
    
}
