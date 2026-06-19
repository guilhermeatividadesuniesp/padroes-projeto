import factory.UsuarioFactory;
import factory.Usuario;
import model.Pedido;
import strategy.PixPagamento;
import strategy.CartaoPagamento;

public class Main {

    public static void main(String[] args) {

        Usuario usuario =
                UsuarioFactory.criarUsuario("cliente");

        usuario.exibirTipo();

        Pedido pedido = new Pedido();

        pedido.setEstrategiaPagamento(
                new PixPagamento()
        );

        pedido.finalizarCompra(250.00);

        pedido.setEstrategiaPagamento(
                new CartaoPagamento()
        );

        pedido.finalizarCompra(350.00);
    }
}