/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.factory.EntityFactory;
import br.com.turismo.model.Cliente;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BWeninger
 */
public class CadastrarClienteAcao extends Acao{
    
    @Override
    public void selecionar() {
        ClienteFactory factory = ClienteFactory.getInstance();
        Cliente cliente = null;
        try {
            cliente = factory.criar();
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastrarClienteAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CadastrarClienteAcao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.next();
        cliente.setNome(nome);
        System.out.println("CPF: ");
        String cpf = sc.next();
        cliente.setCpf(cpf);
        
    }
    
}
