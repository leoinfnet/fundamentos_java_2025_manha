package aula14;

public class Gerente extends Funcionario implements Autenticavel, Administravel {
    private String setor;

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double getBonificacao() {
        System.out.println("bonificacao de gerente");

        return getSalario() * 0.05;
    }

    @Override
    public boolean autenticar(String senha) {
        System.out.println("Autenticacao de gerente");
        if(this.getSenha().equals(senha) && setor.equals("LICITACAO")){
            return true;
        }else return false;
    }
    @Override
    public void administra() {
        System.out.println( "Administrando!");
    }

    @Override
    public boolean qqCoisa() {
        return false;
    }
}
