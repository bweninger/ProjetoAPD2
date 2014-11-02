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

        while (opcaoSelecionada != 0) {
            AgenciaTurismo.getInstance().iniciar();
            opcaoSelecionada = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            AgenciaTurismo.getInstance().tratarOpcaoSelecionada(opcaoSelecionada);
        }
    }
}
