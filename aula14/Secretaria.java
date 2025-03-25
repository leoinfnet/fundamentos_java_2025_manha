package aula14;

public class Secretaria extends Funcionario{
    public Secretaria(double salario) {
        super(salario);
    }

    @Override
    public double getBonificacao(){
        System.out.println("bonificacao de secretaria");
        return getSalario() * 0.03;
    }

}
