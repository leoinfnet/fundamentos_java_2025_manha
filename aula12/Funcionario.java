package aula12;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    //protected double doubleQQCoisa;

    //Isso é um comentário
    //não sei oq faz!
    public double getBonificacao(){
        System.out.println("Bonificacao do funcionario");
        return this.salario  * 0.10;
    }


    public String getNome() {
        return nome;
    }

    private void sayHello(){
        System.out.println("Ola");
    }

    public void sayHello2(){
        System.out.println("Ola");
    }
    protected void sayHello3(){
        System.out.println("Ola");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
