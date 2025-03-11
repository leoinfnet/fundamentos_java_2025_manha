package aula11;

import java.util.Scanner;

public class ContaTester {
    public static void main(String[] args) {
        Conta conta = new Conta("Leonardo");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado");
        double valor = leitor.nextDouble();
        conta.depositar(550);
        conta.sacar(valor);
        System.out.println(conta.verSaldo());
        conta.depositar(-1000);
        conta.alterarNome("Joao");
        //conta.saldo = -6000000; //Pq saldo é privado
        //conta.verificaLimiteChequeEspecial(500);


//Encapsulamento -
    }
}
