package aula12.abstrata;

public class Gerente extends Funcionario{
    @Override
    public double getBonificacao() {
        return this.getSalario() * 0.15;
    }
}
