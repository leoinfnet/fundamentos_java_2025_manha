package lista3.ex3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int[] aleatorios = new int[10];
        Random gerador = new Random();
        for(int i=0;i<aleatorios.length;i++){
            int random = gerador.nextInt(100);
            System.out.print(random + " ");
            aleatorios[i] = random;
        }
        Arrays.sort(aleatorios);
        System.out.println();
        System.out.println("O Menor é: " + aleatorios[0]);
        System.out.println("O Maior é: " + aleatorios[aleatorios.length -1]);
//        for(int i=0;i<aleatorios.length;i++){
//            System.out.print(aleatorios[i] + " ");
//        }
//        System.out.println();
        for(int i=0;i<aleatorios.length;i++){
            System.out.print(aleatorios[i] + " ");
        }
        System.out.println();

        for(int i = aleatorios.length -1;i>=0;i--){
            System.out.print(aleatorios[i] + " ");
        }
        String array = Arrays.toString(aleatorios);
        System.out.println();
        System.out.println(array);

    }
}
