package aula6;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        int nota1;
        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        int contador = 1;
        for(int i =1;i<=3;i++){
            System.out.printf("Digite a nota do aluno %d\n",i);
            soma += leitor.nextInt();
            contador = i;
        }
        System.out.println("Soma das notas eh: " + soma );
        System.out.println("Medias das notas eh: " + soma / contador );
    }
}
