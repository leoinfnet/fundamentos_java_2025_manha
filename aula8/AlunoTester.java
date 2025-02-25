package aula8;

public class AlunoTester {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Leonardo";
        aluno.sobrenome = "Gloria";
        aluno.idade = 15;
        aluno.digaOla();
        String nomeCompleto = aluno.montaNomeCompleto();
        System.out.println(nomeCompleto);
        boolean maiorDeIdade = aluno.isMaiorDeIdade();
        //if(maiorDeIdade) nao preciso fazer isto

        if(aluno.isMaiorDeIdade()){
            System.out.println("Maior de idade");
        }else System.out.println("Menor de idade");
    }
}
