package aula12.abstrata;

public abstract class Funcionario {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void qqCoisa(){
        System.out.println("Hello");
    }
    public abstract double getBonificacao();


}
