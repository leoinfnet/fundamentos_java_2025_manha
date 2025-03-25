package aula14.calculadoraDeDesconto;

public class Influencer implements Desconto{
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.03;
    }
}
