package lista3.ex4;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria joao = new ContaBancaria("Joao");
        ContaBancaria pedro = new ContaBancaria("Pedro");
        ContaBancaria andre = new ContaBancaria("Andre");

        pedro.sacar(100D);
        joao.depositar(1000.98);
        andre.depositar(100);
        andre.sacar(82.63);

        ContaBancaria[] contas = {joao,pedro,andre};
        for(ContaBancaria conta: contas){
            conta.exibirInfo();
        }

    }
}
