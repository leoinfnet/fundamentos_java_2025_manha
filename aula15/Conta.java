package aula15;

import java.io.FileNotFoundException;

public class Conta {
    private float saldo;
    private String email;
    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSaldo() {
        return saldo;
    }

    public void sacar(float valor){
        /*
        if(getSaldo() - valor > 0) {

            this.saldo -= valor;
            return TipoRetorno.OK;
        }else if(getSaldo() - valor < 0 && getSaldo() - valor > -200 ){
            return TipoRetorno.CHEQUE_ESPECIAL;
        }else {
            //return -5; //MAGIC NUMBER
            return TipoRetorno.SEM_SALDO; //MAGIC NUMBER
        }

         */
        if(getSaldo() - valor < 0) {
            throw new IllegalArgumentException("Saldo Invalido");
        }
        this.saldo -= valor;


    }
    public void enviarEmailErroNoSaldo(){
        System.out.println("Enviando email para + " + email);
    }
}
