package aula8.construtores;

public class CarroTester {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "fusca";
        carro.imprimirModelo();
        Carro carro2 = new Carro("Golf");
        carro2.imprimirModelo();
    }
}
