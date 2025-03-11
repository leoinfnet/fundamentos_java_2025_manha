package aula11;

public class ContaTester2 {
    public static void main(String[] args) {
        Conta conta = new Conta("Leonardo");
        System.out.println(conta.getNumeroDeContas()); //1
        Conta conta1 = new Conta("Pedro");
        Conta conta2 = new Conta("Joao");

        System.out.println(conta1.getNumeroDeContas());//3
        System.out.println(conta2.getNumeroDeContas());//3
        //3;
    }
}
