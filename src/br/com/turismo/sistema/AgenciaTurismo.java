package br.com.turismo.sistema;

import br.com.turismo.menu.Acao;
import br.com.turismo.menu.CadastrarClienteAcao;
import br.com.turismo.menu.FazerCheckInAcao;
import br.com.turismo.menu.Menu;
import br.com.turismo.menu.Opcao;
import br.com.turismo.menu.ReservaAssentoAcao;

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
    private Menu opcaoAtual;

    private AgenciaTurismo() {
        super();
        this.opcaoAtual = new Menu();

        Menu menuCliente = new Menu();
        menuCliente.setDescricao("Cliente");
        opcaoAtual.adicionarOpcao(menuCliente);
        
        Acao acao = new CadastrarClienteAcao();
        acao.setDescricao("Cadastrar-se");
        menuCliente.adicionarOpcao(acao);
        
        acao = new ReservaAssentoAcao();
        acao.setDescricao("Reservar assento em voo");
        menuCliente.adicionarOpcao(acao);
        
        acao = new FazerCheckInAcao();
        acao.setDescricao("Fazer check-in no hotel");
        menuCliente.adicionarOpcao(acao);        

        Menu menuAgenteTurismo = new Menu();
        menuAgenteTurismo.setDescricao("Agente de viagem");
        opcaoAtual.adicionarOpcao(menuAgenteTurismo);
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
        } else {
            this.opcaoAtual.tratarSelecao(i);
        }
    }

    private void encerrar() {
        System.out.println("Obrigado por visitar a MackTurismo");
        System.exit(0);
    }
}
