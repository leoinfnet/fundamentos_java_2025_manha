package revisaoAT;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Sistema sistema = new Sistema();
        while(true){
            System.out.println("============");
            System.out.println("\n Menu");
            System.out.println("1. Adicionar Funcionario Salario Fixo");
            System.out.println("2. Adicionar Funcionario Comissionado");
            System.out.println("3. Adicionar Funcionario Por Hora");
            System.out.println("4. Calcular Pagamentos");
            System.out.println("5. Exibir Funcionarios");
            System.out.println("6. Gerar Relatorio");
            System.out.println("7. Sair");
            System.out.println("============");
            short opcao = leitor.nextShort();
            if(opcao == 1) {
                String nome = getNome(leitor);
                double salario = getSalarioBase(leitor);
                SalarioFixo salarioFixo = new SalarioFixo(nome, salario);
                sistema.adicionarFuncionario(salarioFixo);
            }else if(opcao == 2) {
                String nome = getNome(leitor);
                double salario = getSalarioBase(leitor);
                System.out.println("Digite o valor da Comissao:");
                double comissao = leitor.nextDouble();
                try{
                    Comissionado comissionado = new Comissionado(nome, salario, comissao);
                    sistema.adicionarFuncionario(comissionado);
                }catch (IllegalArgumentException ex){
                    System.out.println(ex.getMessage());
                    continue;
                }
            }else if(opcao == 3) {
                String nome = getNome(leitor);
                double salario = getSalarioBase(leitor);
                System.out.println("Digite a quantidade de horas Trabalhadas");
                int horas = leitor.nextInt();
                PorHora porHora = new PorHora(nome, salario, horas);
                sistema.adicionarFuncionario(porHora);
            }else if (opcao == 4){
                sistema.calcularPagamento();
            }else if(opcao == 5){
                sistema.exibirFuncionarios();
            }else if (opcao == 6){
                sistema.gerarRelatorio();
            }
            if(opcao == 7) break;
        }
    }

    private static String getNome(Scanner leitor) {
        System.out.println("Digite o nome:");
        String nome = leitor.next();
        return nome;
    }
    private static double getSalarioBase(Scanner leitor) {
        System.out.println("Digite o salario Base:");
        double salarioBase = leitor.nextDouble();
        return salarioBase;
    }
}
