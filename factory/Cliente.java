package factory;

public class Cliente implements Usuario {

    @Override
    public void exibirTipo() {
        System.out.println("Usuário do tipo Cliente");
    }
}