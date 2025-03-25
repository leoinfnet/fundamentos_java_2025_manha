package aula14.calculadoraDeDesconto;

public class Main {
    public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        calculadora.calcularDesconto("Premium",300.50);

        calculadora.calcular(new Fidelidade(), 300);
        calculadora.calcular(new Influencer(), 400);
        //calculadora.calcularDesconto()//tipo)

        Cliente cliente = new Cliente(new Influencer());
        cliente.calcularDesconto(300.78);
    }
}
