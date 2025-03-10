package lista3.ex5;

import java.util.Arrays;

public class Aluno {
    String nome;
    double[] notas;
    Aluno(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }
    public double calcularMedia(){
        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }
        return soma  / notas.length;
    }
    public void exibirInfos(){
        System.out.println("================");
        System.out.println("Nome: " +  this.nome );
        System.out.println("Notas: " + Arrays.toString(this.notas) );
        System.out.printf("Media: %.2f\n", calcularMedia() );
    }
}
