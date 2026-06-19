package strategy;

public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via PIX: R$ " + valor);
    }
}