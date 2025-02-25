package aula6;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean controle = true;
        for(int i =0;controle;i++){
            System.out.println("Digite uma nota: [Digite \'-1\' para sair]");
            double nota = leitor.nextDouble();
            if(nota == -1){
                controle = false;
            }
        }
    }
}
