package aula13.empresa;

import java.util.Objects;

public class Gerente extends Funcionario{
    private String nome;
    private String cpf;

    private String setor;
    public Gerente(String setor, double salario) {
        super(salario);
        this.setor = setor;
        System.out.println("Gerente do setor: " + setor);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getBonificacao() {
        //Copiar codigo super complexo??
        double bonificacaoDoFuncionario = super.getBonificacao();
        System.out.println("Bonificacao Do gerente");
        return bonificacaoDoFuncionario + 10;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gerente gerente = (Gerente) o;
        return Objects.equals(nome, gerente.nome) && Objects.equals(cpf, gerente.cpf);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }
}
