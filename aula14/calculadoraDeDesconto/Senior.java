package aula14.calculadoraDeDesconto;

public class Senior implements Desconto {


    @Override
    public double calcularDesconto(double valorCompra) {
        return valorCompra * 0.15;
    }
}
