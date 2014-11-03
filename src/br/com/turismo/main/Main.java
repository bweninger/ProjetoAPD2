/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.main;

import br.com.turismo.factory.ClienteFactory;
import br.com.turismo.sistema.AgenciaTurismo;
import br.com.turismo.factory.HotelFactory;
import br.com.turismo.factory.QuartoFactory;
import br.com.turismo.model.Cliente;
import br.com.turismo.model.Hotel;
import br.com.turismo.model.Quarto;
import br.com.turismo.model.TipoQuarto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BWeninger
 */
public class Main {

    private static int opcaoSelecionada = -1;

    public static void main(String[] args) {
        try {
            Cliente c = ClienteFactory.getInstance().criar();
            c.setNome("Bruno Weninger");
            c.setCpf("242424");
            
            c = ClienteFactory.getInstance().criar();
            c.setNome("Danillo Bonzao");
            c.setCpf("777777");
            
            c = ClienteFactory.getInstance().criar();
            c.setNome("Bruno Novinho");
            c.setCpf("123456");
            
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
        
        while (opcaoSelecionada != 0) {
            AgenciaTurismo.getInstance().iniciar();
            opcaoSelecionada = Integer.parseInt(AgenciaTurismo.getInstance().lerDados());
            AgenciaTurismo.getInstance().tratarOpcaoSelecionada(opcaoSelecionada);
        }
    }
}
