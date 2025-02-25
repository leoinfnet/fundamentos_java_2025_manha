package aula6;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for(int i=0;leitor.next().charAt(0) != 'q';i++){
            System.out.println("Funciona:");
        }
    }
}

