import java.util.Scanner;
class Calculadora {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha a operação (\" + \" , \" - \",  \" * \",  \" \\ \")");
        String dadoUsuario = leitor.next();
        char operacao = dadoUsuario.charAt(0);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();
        
        if(operacao == '+'){
            int soma = valor1 + valor2;
            System.out.printf("Resultado: %d", soma );
        }else if (operacao == '-'){
            int subtracao = valor1 - valor2;
            System.out.printf("Resultado: %d", subtracao )  ; 
        }else if(operacao == '*'){
            int multiplicao = valor1 * valor2;
            System.out.printf("Resultado: %d", multiplicao ) ; 
        }else if(operacao == '/'){
            //Fazendo o cast manual int multiplicao = (int) valor1 / valor2;
            double divisao = valor1 / valor2;
            System.out.printf("Resultado: %f", divisao ) ; 
        }else {
            System.out.println("OP INVALIDA" ) ; 
        }
    }
    
}