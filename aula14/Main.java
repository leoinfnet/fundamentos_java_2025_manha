package aula14;

public class Main {
    public static void main(String[] args) {
        Intranet intranet = new Intranet();
        //Funcionario f1 = new Funcionario(1000);
        Gerente g1 = new Gerente(10_000);
        Diretor diretor = new Diretor(15_000);
        Secretaria s1 = new Secretaria(3000);
        Cliente cliente = new Cliente();
        intranet.login(cliente);
        intranet.login(g1);
        intranet.login(diretor);

        intranet.calcularBonificacao(s1);
        intranet.calcularBonificacao(g1);
        intranet.calcularBonificacao(diretor);

    }
}
