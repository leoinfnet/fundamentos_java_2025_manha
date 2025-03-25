package aula13.intranet;

public class Gerente extends Funcionario{
    private String setor;
    public boolean autenticar(String senha){
        if(getSenha().equals(senha)){
            return true;
        }else return false;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
