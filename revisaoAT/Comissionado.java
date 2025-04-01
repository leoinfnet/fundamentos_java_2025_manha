package revisaoAT;

public class Comissionado extends Funcionario{
    private double valorComissao;
    public Comissionado(String nome, double salarioBase, double valorComissao) {
        super(nome, salarioBase);
        this.valorComissao = valorComissao;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    @Override
    public String toString() {
        return "Comissionado{" +
                "valorComissao=" + valorComissao +
                "} " + super.toString();
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase() + valorComissao;
    }
}
