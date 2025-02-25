package aula7;

public class CarroTester {
    public static void main(String[] args) {

        Carro golf = new Carro();
        System.out.println(golf.isFlex);
        golf.isFlex = true;
        golf.capacidadeDoTanque = 56;
        golf.quantidadeDeKmPorLitro = 7;
        golf.quantidadeDePassageiros = 5;
        golf.modelo = "Golf GTI";
        golf.frear();
        golf.acelerar();
        System.out.println(golf.isFlex);
        System.out.println(golf.quantidadeDePassageiros);
        System.out.println("Contador de Carro Golf: " + golf.contadorDeCarro);


        golf.contadorDeCarro = 1;
        Carro porshe = new Carro();
        porshe.isFlex = false;
        porshe.quantidadeDeKmPorLitro = 12;
        porshe.modelo = "Cayene";
        porshe.acelerar();
        porshe.frear();;

        porshe.contadorDeCarro = golf.contadorDeCarro++;

        System.out.println(porshe.contadorDeCarro);
        System.out.println(golf.contadorDeCarro);


    }
}
