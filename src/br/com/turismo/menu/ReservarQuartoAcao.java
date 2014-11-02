/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.factory.PacoteFactory;
import br.com.turismo.factory.ReservaHotelFactory;
import br.com.turismo.model.Cliente;
import br.com.turismo.model.Pacote;
import br.com.turismo.model.Reserva;
import br.com.turismo.model.ReservaQuarto;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BWeninger
 */
public class ReservarQuartoAcao extends Acao {

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
            }

            pkg.setCliente(c);            
            ReservaQuarto reserva = ReservaHotelFactory.getInstance().criar();
            pkg.setReservaQuarto(reserva);
            reserva.reservar();
        } catch (InstantiationException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }
}
