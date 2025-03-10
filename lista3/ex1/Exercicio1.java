package lista3.ex1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = leitor.nextLine();
        int contador=0;
//        "Ala Mundo!" => 10
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'A'){
                contador++;
            }
        }
        System.out.printf("A letra \'a\' aparece %d vezes\n",contador);
//        "Java" != "java" != "jAVa"
        if (frase.toLowerCase().startsWith("java")) {
            System.out.println("A frase comeca com Java");
        } else {
            System.out.println("A não frase comeca com Java");
        }
        String fraseModificada = frase.replace("Java","Python");
        System.out.println(fraseModificada);
        //Trabalhando com classes!
        Frase frase1 = new Frase();
        frase1.texto = frase;
        frase1.contarOcorrenciesDaLetraA();
        String fraseTrocada = frase1.substituir("Java","Python");
    }

}
