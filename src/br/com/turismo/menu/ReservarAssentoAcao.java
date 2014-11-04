/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.factory.HotelFactory;
import br.com.turismo.factory.PacoteFactory;
import br.com.turismo.factory.VooFactory;
import br.com.turismo.model.Assento;
import br.com.turismo.model.Cliente;
import br.com.turismo.model.Pacote;
import br.com.turismo.model.Voo;
import br.com.turismo.sistema.AgenciaTurismo;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BWeninger
 */
public class ReservarAssentoAcao extends Acao{

    @Override
    public Menu selecionar() {
        Scanner sc = new Scanner(System.in);
        Cliente c = null;
        while (c == null) {
            System.out.println("Informe o CPF do Cliente: ");
            String cpf = sc.next();
            if (cpf.equals("000")) {
                return null;
            }

            c = ClienteFactory.getInstance().buscarClientePorCPF(cpf);
            if (c == null) {
                System.out.println("Não existe nenhum cliente cadastrado com esse CPF.");
                System.out.println("Tente novamente ou digite 000 para retornar ao menu anterior.");
            }
        }

        Pacote pkg = PacoteFactory.getInstance().buscarPacotePorCliente(c);

        try {
            if (pkg == null) {
                pkg = PacoteFactory.getInstance().criar();
                pkg.setCliente(c);
            }

            Voo voo = selecionarVoo();
            Assento assento = selecionarAssento(voo);
            
            System.out.println("Quantas diárias você deseja?");

        } catch (InstantiationException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    private Voo selecionarVoo() {
        List<Voo> voos = VooFactory.getInstance().buscarVoos();
        Integer opcao = -1;
        Integer nroTentativas = 0;
        Voo v = null;
        while (v == null) {
            if (nroTentativas > 0) {
                System.out.println("Opção inexistente. ");
            }
            System.out.println("Selecione seu Voo");
            for (Voo voo : voos) {
                System.out.println((voos.indexOf(voo) + 1) + ". " + voo.getOrigem() + " - " + voo.getDestino());
            }

            opcao = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            v = VooFactory.getInstance().buscarVooPorIndice(opcao);
            nroTentativas++;
        }

        return v;
    }

    private Assento selecionarAssento(Voo voo) {
        Assento result = null;
        Integer opcao = -1;
        Integer nroTentativas = 0;
        while (result == null) {
            System.out.println("Selecione o quarto que deseja: ");
            for (Assento a : voo.getAssentos()) {
                System.out.println((voo.getAssentos().indexOf(a) + 1) + "." + a.toString());
            }

            opcao = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            result = voo.getAssentos().get(opcao - 1);
        }
        return result;
    }
}
