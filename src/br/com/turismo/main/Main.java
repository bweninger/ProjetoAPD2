/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.main;

import br.com.turismo.sistema.AgenciaTurismo;
import java.util.Scanner;

/**
 *
 * @author BWeninger
 */
public class Main {
    
    private static int opcaoSelecionada = -1;
    
    public static void main(String[] args) {
        
        AgenciaTurismo.getInstance().iniciar();  
        
        while(opcaoSelecionada != 0){
            Scanner sc = new Scanner(System.in);
            opcaoSelecionada = sc.nextInt();
            AgenciaTurismo.getInstance().tratarOpcaoSelecionada(opcaoSelecionada);
        }       
    }
    
}
