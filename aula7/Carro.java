package aula7;

public class Carro {
    int quantidadeDeKmPorLitro;
    int quantidadeDePassageiros;
    int capacidadeDoTanque;
    String modelo;
    boolean isFlex;
    int contadorDeCarro;

    void acelerar(){

        System.out.printf("Acelerando o %s\n", modelo);
    }
    void frear(){
        System.out.printf("Parando o %s\n", modelo);

    }

}
