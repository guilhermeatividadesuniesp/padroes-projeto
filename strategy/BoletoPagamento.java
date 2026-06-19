package strategy;

public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Boleto: R$ " + valor);
    }
}