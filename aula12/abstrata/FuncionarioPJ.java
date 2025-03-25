package aula12.abstrata;

public class FuncionarioPJ extends FuncionarioTerceirizado {
    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public double calculPIS() {
        return 0;
    }
}
