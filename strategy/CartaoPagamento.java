package strategy;

public class CartaoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Cartão: R$ " + valor);
    }
}