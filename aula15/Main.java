package aula15;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dividir(8, 4));
        System.out.println(calculadora.dividir(3, 2));
        System.out.println(calculadora.dividir(7, -1));
        //System.out.println(calculadora.dividir(6, 0));
        try{
            float resultado =  6 / 0;

        }catch (ArithmeticException ex){
            System.out.println("Cai na exception");
        }

        Aluno aluno = new Aluno();
        aluno.setNome("leo");
        System.out.println(aluno.getNome().toUpperCase());
        Aluno aluno2 = new Aluno();
        System.out.println(aluno2.getNome().toUpperCase());

    }
}
