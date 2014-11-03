package br.com.turismo.sistema;

import br.com.turismo.factory.HotelFactory;
import br.com.turismo.factory.QuartoFactory;
import br.com.turismo.menu.Acao;
import br.com.turismo.menu.CadastrarClienteAcao;
import br.com.turismo.menu.FazerCheckInAcao;
import br.com.turismo.menu.Menu;
import br.com.turismo.menu.ReservarAssentoAcao;
import br.com.turismo.menu.ReservarQuartoAcao;
import br.com.turismo.model.Hotel;
import br.com.turismo.model.Quarto;
import br.com.turismo.model.TipoQuarto;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BWeninger
 */
public class AgenciaTurismo {

    private static final AgenciaTurismo SISTEMA = new AgenciaTurismo();
    private Scanner sc = new Scanner(System.in);
    private Stack<Menu> opcoesAnteriores;
    private Menu opcaoAtual;

    private AgenciaTurismo() {
        super();
        this.opcaoAtual = new Menu();
        this.opcaoAtual.setDescricao("Bem vindo à Mack Turismo. Selecione seu tipo de usuário.");
        
        Menu menuCliente = new Menu();
        menuCliente.setDescricao("Cliente");
        opcaoAtual.adicionarOpcao(menuCliente);

        Acao acao = new CadastrarClienteAcao();
        acao.setDescricao("Cadastrar-se");
        menuCliente.adicionarOpcao(acao);

        acao = new ReservarAssentoAcao();
        acao.setDescricao("Reservar assento em voo");
        menuCliente.adicionarOpcao(acao);

        acao = new FazerCheckInAcao();
        acao.setDescricao("Fazer check-in no hotel");
        menuCliente.adicionarOpcao(acao);

        Menu menuAgenteTurismo = new Menu();
        menuAgenteTurismo.setDescricao("Agente de viagem");
        opcaoAtual.adicionarOpcao(menuAgenteTurismo);

        acao = new ReservarQuartoAcao();
        acao.setDescricao("Fazer reserva de hotel");
        menuAgenteTurismo.adicionarOpcao(acao);
        try {
            Hotel h = HotelFactory.getInstance().criar();
            h.setNome("Hilton");
            
            Quarto q = QuartoFactory.getInstance().criar();
            q.setIdentificador("22B");
            q.setTipoQuarto(TipoQuarto.CAMA_KING_SIZE);
            
            h.adicionarQuarto(q);
            
            q = QuartoFactory.getInstance().criar();
            q.setIdentificador("30C");
            q.setTipoQuarto(TipoQuarto.CAMA_SIMPLES);
            
            h.adicionarQuarto(q);
            
            h = HotelFactory.getInstance().criar();
            h.setNome("Ritz");
            
            q = QuartoFactory.getInstance().criar();
            q.setIdentificador("2002");
            q.setTipoQuarto(TipoQuarto.CAMA_QUEEN_SIZE);
            
            q = QuartoFactory.getInstance().criar();
            q.setIdentificador("4003");
            q.setTipoQuarto(TipoQuarto.DUAS_CAMAS);
            
            h.adicionarQuarto(q);
            
            h = HotelFactory.getInstance().criar();
            h.setNome("Copacabana Palace");
            
            q = QuartoFactory.getInstance().criar();
            q.setIdentificador("111");
            q.setTipoQuarto(TipoQuarto.CAMA_QUEEN_SIZE);
            
            h = HotelFactory.getInstance().criar();
            h.setNome("Mercury");
            
            q = QuartoFactory.getInstance().criar();
            q.setIdentificador("Presidencial I");
            q.setTipoQuarto(TipoQuarto.PRESIDENCIAL);
        } catch (InstantiationException ex) {
            Logger.getLogger(AgenciaTurismo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AgenciaTurismo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(AgenciaTurismo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static AgenciaTurismo getInstance() {
        return AgenciaTurismo.SISTEMA;
    }

    public void iniciar() {
        this.opcaoAtual.exibir();
    }

    public void tratarOpcaoSelecionada(int i) {
        if (i == 0) {
            encerrar();
        } else if (i == 9) {
            opcaoAtual = obterOpcaoAnterior();
        } else {
            Menu result = this.opcaoAtual.tratarSelecao(i);
            if (!result.equals(opcaoAtual)) {
                adicionarHistorico(opcaoAtual);
                opcaoAtual = result;
            }
        }
    }

    private void encerrar() {
        System.out.println("Obrigado por visitar a MackTurismo");
        System.exit(0);
    }

    private void adicionarHistorico(Menu menu) {
        if (this.opcoesAnteriores == null) {
            opcoesAnteriores = new Stack<Menu>();
        }

        opcoesAnteriores.push(menu);
    }
    
    private Menu obterOpcaoAnterior(){
        if(this.opcoesAnteriores == null || this.opcoesAnteriores.isEmpty()){
            return opcaoAtual;
        }else{
            return this.opcoesAnteriores.pop();
        }
    }
    
    public String lerDados(){
        return this.sc.nextLine();
    }
}
