package aula14;

public  abstract class Funcionario {
    private String senha;
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }
    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
