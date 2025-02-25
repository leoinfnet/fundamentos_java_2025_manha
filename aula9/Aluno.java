package aula9;

public class Aluno {
    String nome;
    public boolean primeiroNomeIgual(String outroNome){
        int posicaoDoEspaco = nome.indexOf(" ");
        String primeiroNome = nome.substring(0,posicaoDoEspaco);
        posicaoDoEspaco = outroNome.indexOf(" ");
        String primeiroNomeOutro = outroNome.substring(0,posicaoDoEspaco);
        if(primeiroNomeOutro.equals(primeiroNome))return true;
        else return false;
    }
}
