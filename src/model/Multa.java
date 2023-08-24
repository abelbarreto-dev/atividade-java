/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author paulojp
 */
public class Multa {
    private int idMulta;
    private int idCliente;
    private String descricao;
    private float valor;

    public Multa(int idMulta, int idEmprestimo, String descricao, float valor, String pagamento) {
        this.idMulta = idMulta;
        this.idCliente = idEmprestimo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Multa() {
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
