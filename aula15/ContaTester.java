package aula15;

import java.util.Random;

public class ContaTester {
    private static final int SALDO_INSUFICIENTE = -5;
    public static void main(String[] args) {
        Random random = new Random();
        float saldoInicial = random.nextFloat(500f);
        System.out.println("Saldo inicial " +  saldoInicial);
        Conta conta = new Conta(saldoInicial);
        conta.setEmail("teste@teste.com");
        try{
            conta.sacar(300f);
            System.out.println(conta.getSaldo());
            conta.sacar(450f);
        }catch (IllegalArgumentException minhaExp){
            System.out.println(minhaExp.getMessage());
            conta.enviarEmailErroNoSaldo();
        }
        System.out.println("Teste");

//        if(conta.sacar(450f).equals(TipoRetorno.SEM_SALDO)){
//            conta.enviarEmailErroNoSaldo();
//        }
        System.out.println(conta.getSaldo());
    }
}
