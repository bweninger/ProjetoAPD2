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
public abstract class AbstractEntityFactory<T> {
    
    private Class<T> clazz;
    protected List<T> entidades;
    
    protected AbstractEntityFactory(Class<T> clazz){        
        this.clazz = clazz;
        entidades = new ArrayList<T>();
    }
    
    public T criar() throws InstantiationException, IllegalAccessException, NoSuchMethodException{
        if(entidades == null){
            entidades = new ArrayList<T>();
        }
        clazz.getDeclaredConstructors()[0].setAccessible(true);
        T t = clazz.newInstance();
        entidades.add(t);
        return t;        
    }
    
}
