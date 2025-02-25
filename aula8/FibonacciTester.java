package aula8;

import java.util.Scanner;

public class FibonacciTester {
    public static void main(String[] args) {
        int x;
        x = 15;
        CalculadoraDeFibonacci calculadora;
        calculadora = new CalculadoraDeFibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Número:");
        int numero = scanner.nextInt();
        long n = calculadora.calcular(numero);
        System.out.println("N termo: " + n);
        calculadora.imprimirASequencia(numero);

        int fibonacci = calculadora.fibonacci(numero);
        System.out.println(fibonacci);
    }
}
