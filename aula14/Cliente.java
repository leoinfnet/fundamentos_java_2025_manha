package aula14;

public class Cliente implements Autenticavel {

    @Override
    public boolean autenticar(String senha) {
        System.out.println("Autenticacao de cliente");
        return false;

    }
}
