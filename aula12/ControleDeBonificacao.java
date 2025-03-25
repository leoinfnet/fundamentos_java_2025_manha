package aula12;

public class ControleDeBonificacao {
    private double totalBonificacoes = 0;
    public void registra(Funcionario funcionario){
        this.totalBonificacoes += funcionario.getBonificacao();
    }
    public double getTotalBonificacoes(){
        return this.totalBonificacoes;
    }
}
