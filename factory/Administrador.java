package factory;

public class Administrador implements Usuario {

    @Override
    public void exibirTipo() {
        System.out.println("Usuário do tipo Administrador");
    }
}
