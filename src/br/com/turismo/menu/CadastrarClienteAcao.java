/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.model.Cliente;
import br.com.turismo.sistema.AgenciaTurismo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BWeninger
 */
public class CadastrarClienteAcao extends Acao {

    @Override
    public Menu selecionar() {
        ClienteFactory factory = ClienteFactory.getInstance();
        Cliente cliente = null;
        try {
            cliente = factory.criar();
        } catch (InstantiationException ex) {
            Logger.getLogger(CadastrarClienteAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(CadastrarClienteAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(CadastrarClienteAcao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nome: ");
        String nome = AgenciaTurismo.getInstance().lerDados();
        cliente.setNome(nome);
        System.out.println("CPF: ");
        String cpf = AgenciaTurismo.getInstance().lerDados();
        cliente.setCpf(cpf);

        System.out.println(nome + " cadastrado com sucesso.");
        return null;
    }
}
