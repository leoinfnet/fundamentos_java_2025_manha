package aula12;

public class Main {
    public static void main(String[] args) {
        ControleDeBonificacao controle = new ControleDeBonificacao();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Leonardo");
        funcionario.setSalario(1_000D);
        System.out.println(funcionario.getBonificacao());
        controle.registra(funcionario);
        System.out.println("Total de bonificacoes até o momento: " + controle.getTotalBonificacoes());

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Gerente1");
        gerente1.setSenha(123456);
        gerente1.setSalario(10_000);
        System.out.print("Bonificação do gerente ");
        System.out.println(gerente1.getBonificacao());
        controle.registra(gerente1);
        System.out.println("Total de bonificacoes até o momento: " + controle.getTotalBonificacoes());

        Funcionario f = new Gerente();
        f.setSalario(1000);
        System.out.println(f.getBonificacao());

        Gerente gerente2 = new Gerente();
        Funcionario f2 = gerente2;


    }
}
