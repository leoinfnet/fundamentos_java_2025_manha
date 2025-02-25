package aula7;

public class StringTester {
    public static void main(String[] args) {
        //String nome1 = new String("Leonardo"); //Evitar
        String nome2 = "Leonardo"; //correto
        String nome3 = nome2;
        System.out.println(nome2);
        System.out.println(nome3);
        nome3 = "Teste";
        System.out.println(nome2);
        System.out.println(nome3);



    }
}
