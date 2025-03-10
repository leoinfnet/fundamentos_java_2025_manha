package lista3.ex5;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", new double[] {7.5, 8.0, 6.5});
        Aluno aluno2 = new Aluno("Maria", new double[] {9.0, 8.5, 7.0});
        Aluno aluno3 = new Aluno("Carlos", new double[] {6.0, 5.5, 7.0});
        Aluno aluno4 = new Aluno("Ana", new double[] {8.0, 9.0, 7.5});
        Aluno aluno5 = new Aluno("Pedro", new double[] {5.5, 6.0, 5.0});

        Aluno[] turma = {aluno1,aluno2,aluno3,aluno4,aluno5};
        System.out.println("Informações dos alunos");
        double somaDasMedias = 0;
        for(Aluno aluno: turma){
            somaDasMedias += aluno.calcularMedia();
            aluno.exibirInfos();
        }
        double mediaDaTurma = somaDasMedias / turma.length;
        System.out.printf("A media da turma é %.2f", mediaDaTurma);


    }
}
