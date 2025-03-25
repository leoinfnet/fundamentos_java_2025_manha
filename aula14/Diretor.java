package aula14;

public class Diretor extends Funcionario implements Autenticavel {

    public Diretor(double salario) {
        super(salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("bonificacao de diretor");
        return getSalario() * 0.07;
    }


    @Override
    public boolean autenticar(String senha) {
        System.out.println("Autenticacao de diretor");
        return true;
    }



}
