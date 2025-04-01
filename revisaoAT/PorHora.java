package revisaoAT;

public class PorHora extends Funcionario{
    private int horasTrabalhadas;
    public PorHora(String nome, double salarioBase, int horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "PorHora{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                "} " + super.toString();
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase() * horasTrabalhadas;
    }
}
