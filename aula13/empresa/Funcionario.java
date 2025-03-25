package aula13.empresa;

public abstract class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double getBonificacao(){
        //Regra mega complexa
        System.out.println("Bonificacao do funcionario");
        return this.salario * 0.10;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
