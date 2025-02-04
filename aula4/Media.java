import java.util.Scanner;
class Media{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.print("Digite seu nome: ");
        nome = scanner.next();
        System.out.println();
        System.out.print("Digite a nota1 (0 - 10) ");
        double nota1 = scanner.nextDouble();
        System.out.println();
        
        System.out.print("Digite a nota2 (0 - 10) ");
        double nota2 = scanner.nextDouble();
        System.out.println();
        System.out.print("Digite a nota3 (0 - 10) ");
        double nota3 = scanner.nextDouble();
        System.out.println();
        double mediaPonderada = (nota1 * 0.50) + (nota2 * 0.30) + (nota3 * 0.2);
        double mediaAritimetica = (nota1 + nota2 + nota3) / 3;
        System.out.printf("%s => nota1: %.2f , nota2: %.2f nota3: %.2f, media pond: %.2f , media ari: %.2f %n ",
            nome,nota1, nota2,nota3,mediaPonderada, mediaAritimetica);
        System.out.println();
        if(mediaPonderada >=9) System.out.println("A");
        else if(mediaPonderada >= 7) System.out.println("B");
        else if(mediaPonderada >= 5) System.out.println("C");
        else System.out.println("D");
        

    }
}