/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.turismo.menu;

/**
 *
 * @author BWeninger
 */
public abstract class Opcao {

    private int idOpcao;
    private String descricao;

    public int getIdOpcao() {
        return idOpcao;
    }

    protected void setIdOpcao(int idOpcao) {
        this.idOpcao = idOpcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract void selecionar();
}
