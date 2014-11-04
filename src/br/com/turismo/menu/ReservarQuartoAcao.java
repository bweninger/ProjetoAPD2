/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.factory.HotelFactory;
import br.com.turismo.factory.PacoteFactory;
import br.com.turismo.factory.ReservaHotelFactory;
import br.com.turismo.model.Cliente;
import br.com.turismo.model.Hotel;
import br.com.turismo.model.Pacote;
import br.com.turismo.model.Quarto;
import br.com.turismo.model.ReservaQuarto;
import br.com.turismo.sistema.AgenciaTurismo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
                pkg.setCliente(c);
            }

            Hotel hotel = selecionarHotel();
            Quarto quarto = selecionarQuarto(hotel);
            Integer totalDiarias = obterTotalDiarias();
            Date dataInicio = obterDataInicio();
            System.out.println("O total da estadia é R$ " + (quarto.getTipoQuarto().getPreco() * totalDiarias));
            if (confirmarReserva()) {
                ReservaQuarto reserva = ReservaHotelFactory.getInstance().criar();
                reserva.setDataInicio(dataInicio);
                Calendar cal = Calendar.getInstance();
                cal.setTime(dataInicio);
                cal.add(Calendar.DAY_OF_MONTH, totalDiarias);
                reserva.setDataFim(cal.getTime());
                pkg.adicionarReservaQuarto(reserva);
                System.out.println("Reserva criada com sucesso");
            }

        } catch (InstantiationException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ReservarQuartoAcao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private Hotel selecionarHotel() {
        List<Hotel> hoteis = HotelFactory.getInstance().buscarHoteis();
        Integer opcao = -1;
        Integer nroTentativas = 0;
        Hotel h = null;
        while (h == null) {
            if (nroTentativas > 0) {
                System.out.println("Opção inexistente. ");
            }
            System.out.println("Selecione seu hotel");
            for (Hotel hotel : hoteis) {
                System.out.println((hoteis.indexOf(hotel) + 1) + ". " + hotel.getNome());
            }

            opcao = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            h = HotelFactory.getInstance().buscarHotelPorIndice(opcao);
            nroTentativas++;
        }

        return h;
    }

    private Quarto selecionarQuarto(Hotel hotel) {
        Quarto result = null;
        Integer opcao = -1;
        Integer nroTentativas = 0;
        while (result == null) {
            System.out.println("Selecione o quarto que deseja: ");
            for (Quarto q : hotel.getQuartos()) {
                System.out.println((hotel.getQuartos().indexOf(q) + 1) + "." + q.toString());
            }

            opcao = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            result = hotel.getQuartos().get(opcao - 1);
        }
        return result;
    }

    private int obterTotalDiarias() {
        System.out.println("Insira quantas diárias você deseja?");
        return Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
    }

    private Date obterDataInicio() {
        Date result = null;
        while (result == null) {
            System.out.println("Insira a data inicial de sua estadia no seguinte formato (dd/MM/aaaa)");
            String dataStr = AgenciaTurismo.getInstance().lerDados();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            try {
                result = fmt.parse(dataStr);
            } catch (ParseException e) {
                System.out.println("Data invalida.");
            }
        }

        return result;
    }

    private Boolean confirmarReserva() {
        Boolean result = null;
        while (result == null) {
            System.out.println("Confirma a reserva? ");
            System.out.println("S - SIM");
            System.out.println("N - NÃO");
            String opcao = AgenciaTurismo.getInstance().lerDados();
            if (opcao.equals("S")) {
                result = true;
            } else if (opcao.equals("N")) {
                result = false;
            }
        }
        return result;
    }
}
