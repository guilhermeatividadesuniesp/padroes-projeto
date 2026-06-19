package model;

import strategy.PagamentoStrategy;

public class Pedido {

    private PagamentoStrategy estrategiaPagamento;

    public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
        this.estrategiaPagamento = estrategiaPagamento;
    }

    public void finalizarCompra(double valor) {
        estrategiaPagamento.pagar(valor);
    }
}