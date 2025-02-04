import  java.util.Scanner;
class Leitura {
    public static void main(String [] args){
        int nota = 0;
        double altura;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da nota:");
        nota = leitor.nextInt();
        System.out.printf("O valor de nota eh: %d%n",nota);

        System.out.print("Digite o valor da altura:  ");
        altura = leitor.nextDouble();   
        System.out.println("O valor da altura eh: " + altura);

        System.out.println("Digite o seu nome:  ");
        String nomeDoUsuario = leitor.next();  
        System.out.print("O seu nome eh: " + nomeDoUsuario);
    }
} 