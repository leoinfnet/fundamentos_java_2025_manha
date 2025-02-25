package aula6;

public class OperadorIncremento {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        int resultado1 = i++; //Pos Incremento -> Atribuiu o valor e depois incrementa o valor de I
        int resultado2 = ++j; //Primeiro incrementa o valor de I e depois atribui a variavel resultado2

        System.out.println("O valor da variavel i eh: " + i); //6
        System.out.println("O valor da variavel j eh: " + j); //6
        System.out.println("Resultado 1: " + resultado1); // 6
        System.out.println("Resultado 2: " + resultado2); //6
    }
}
