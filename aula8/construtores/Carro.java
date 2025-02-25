package aula8.construtores;

public class Carro {
    String modelo;
    Carro(){
        System.out.println("Construindo Carro");
    }
    Carro(String modelo){
        this.modelo = modelo;
    }
    void imprimirModelo(){
        System.out.println("o modelo do carro eh: " + modelo);
    }
}
