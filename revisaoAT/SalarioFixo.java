package revisaoAT;

public class SalarioFixo extends Funcionario{
    public SalarioFixo(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase();
    }
}
