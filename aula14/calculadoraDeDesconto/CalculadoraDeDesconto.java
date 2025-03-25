package aula14.calculadoraDeDesconto;

public class CalculadoraDeDesconto {
    public double calcularDesconto(String tipoCliente,
                                   double valorCompra) {
        double desconto = 0;

        if (tipoCliente.equals("premium")) {
            desconto = valorCompra * 0.2;
        } else if (tipoCliente.equals("regular")) {
            desconto = valorCompra * 0.1;
        } else if (tipoCliente.equals("novato")) {
            // Desconto de 5% para clientes novatos
            desconto = valorCompra * 0.05;
        } else if (tipoCliente.equals("vip")) {
            // Desconto de 30% para clientes VIP
            desconto = valorCompra * 0.3;
        } else if (tipoCliente.equals("senior")) {
            // Desconto de 15% para clientes seniores
            desconto = valorCompra * 0.15;
        } else if (tipoCliente.equals("corporativo")) {
            // Desconto de 25% para clientes corporativos
            desconto = valorCompra * 0.25;
        } else if (tipoCliente.equals("funcionario")) {
            // Desconto de 40% para funcionários da empresa
            desconto = valorCompra * 0.4;
        } else if (tipoCliente.equals("influencer")) {
            // Desconto de 10% para influencers
            desconto = valorCompra * 0.1;
        } else if (tipoCliente.equals("estudante")) {
            // Desconto de 5% para estudantes
            desconto = valorCompra * 0.05;
        } else if (tipoCliente.equals("militar")) {
            // Desconto de 50% para clientes militares
            desconto = valorCompra * 0.5;
            return desconto;
        }else if (tipoCliente.equals("fidelidade")){
            desconto = valorCompra * 0.01;
            valorCompra += 5;
        }
        return desconto;
    }
    public double calcularDesconto2(TipoCliente tipo,double valorCompra){
            if(tipo.equals(TipoCliente.INFLUENCER));
            return 0;
    }
    public double calcular(Desconto d, double valorCompra){
        return d.calcularDesconto(valorCompra);

    }
    //SOLID
    //OPEN CLOSED PRINCIPLE

}
