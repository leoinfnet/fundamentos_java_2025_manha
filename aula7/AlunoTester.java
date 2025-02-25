package aula7;

public class AlunoTester {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Leonardo";
        System.out.println("Nome: " + aluno1.nome);

        //Aluno aluno2 = aluno1;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Joao";
        System.out.println("Nome: " + aluno2.nome);
        //System.out.println("Nome: " + aluno2.nome);

        System.out.println("Nome: " + aluno1.nome);


        Endereco endereco1 = new Endereco();
        endereco1.logradouro = "Rua A";
        endereco1.cep = "24220401";

        aluno1.endereco = endereco1;
        System.out.println(aluno1.endereco.logradouro);

        endereco1.logradouro = "Rua B";
        System.out.println(aluno1.endereco.logradouro);

        aluno1.endereco.logradouro = "Rua C";
        //System.out.println(aluno2.endereco.logradouro);

        System.out.println("====================");
        Aluno a5;
        a5 = new Aluno();
        a5.nome = "Teste";

        System.out.println("====================");
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Pedro";
        Aluno aluno4 = aluno3;
        System.out.println(aluno3.nome);
        System.out.println(aluno4.nome);
        aluno3 = null;
        System.out.println(aluno4.nome);
        System.out.println(aluno3.nome);
    }
}
