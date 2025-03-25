package aula14.calculadoraDeDesconto;

public class Regular implements Desconto{
    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.6;
    }
}
