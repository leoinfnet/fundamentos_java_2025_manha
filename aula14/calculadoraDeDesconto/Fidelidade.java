package aula14.calculadoraDeDesconto;

public class Fidelidade implements Desconto{
    public double calcularDesconto(double valorCompra){
        return valorCompra * 0.01;
    }
}
