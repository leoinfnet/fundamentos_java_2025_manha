package aula8;

import java.sql.SQLOutput;

public class Aluno {
    String nome;
    String sobrenome;
    int idade;

    String montaNomeCompleto(){
        String nomeCompleto = nome + " " + sobrenome;
        return nomeCompleto;
    }
    void digaOla(){
        System.out.println("Ola!");
    }
    boolean isMaiorDeIdade(){
        if(idade >= 18) return true;
        else return false;
    }

}
