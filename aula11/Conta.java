package aula11;

import java.util.Random;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    private double limite;
    private static int totalDeContas = 0;
    Conta(String titular){
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = new Random().nextInt(1000);
        this.limite = 500;
        incrementarNumeroDeContas();
    }
    public void sacar(double valor){
        if(verificaLimiteChequeEspecial(valor)){
            this.saldo -= valor;
        }else {
            System.out.println("Valor Invalido");
        }
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor Invalido");
        }else{
            this.saldo += valor;
        }
    }
    double verSaldo(){
        return this.saldo;
    }
    void alterarNome(String novoNome){
        this.titular = novoNome;
    }
    private boolean verificaLimiteChequeEspecial(double valor) {
        return this.saldo + limite >= valor;
    }
    private void incrementarNumeroDeContas(){
        this.totalDeContas++;
    }
    public int getNumeroDeContas(){
        return this.totalDeContas;
    }
    public static void digaOla(){
        System.out.println("Ola");
    }

}
