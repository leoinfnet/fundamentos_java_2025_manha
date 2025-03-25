package aula12;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    //Sobreescrita
    @Override
    public double getBonificacao(){
        System.out.println("Bonificacao do gerente");
        return this.getSalario() * 0.15;
    }

    public int getSenha() {
        sayHello2();
        sayHello3();
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
