package aula15;

public class Surpresa {
    public static void main(String[] args) {
        System.out.println("inicio prog");
        metodo1();
        System.out.println("Fim programa");
    }
    static void metodo1(){
        System.out.println("Inicio metodo1");
        try{
            metodo2();
        }catch (ArithmeticException ex){
            int a = 5/2;
            metodo3(5,2);
        }
        System.out.println("Fim metodo 1");
    }
    static void metodo2(){
        System.out.println("Inicio metodo 2");
        metodo3(5,0);
       // int a = 5 /2;
        System.out.println("Fim metodo 2");
    }
    static void metodo3(int a, int b) throws ArithmeticException{
        System.out.println("Inicio metodo 3");
        int c = a / b;
        System.out.println("Fim metodo 3");

    }
}
