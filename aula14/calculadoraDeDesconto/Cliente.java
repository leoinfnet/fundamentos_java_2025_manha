package aula14.calculadoraDeDesconto;

public class Cliente {

    public Cliente(Desconto d) {
        this.d = d;
    }

    Desconto d;
    public double calcularDesconto(double valorCompra){
        return d.calcularDesconto(valorCompra);
    }
}
