package factory;

public class UsuarioFactory {

    public static Usuario criarUsuario(String tipo) {

        if (tipo.equalsIgnoreCase("cliente")) {
            return new Cliente();
        }

        if (tipo.equalsIgnoreCase("admin")) {
            return new Administrador();
        }

        throw new IllegalArgumentException("Tipo inválido");
    }
}