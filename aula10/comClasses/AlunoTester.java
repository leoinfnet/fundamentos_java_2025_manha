package aula10.comClasses;

public class AlunoTester {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "joao";
        aluno.nota = 3.61;
        Aluno aluno2 = new Aluno();
        aluno2.nome = "joaquim";
        aluno2.nota = 1.63;
        Aluno aluno3 = new Aluno();
        aluno3.nome = "pedro";
        aluno3.nota = 9.72;

        Aluno[] alunos = new Aluno[3]; //0 => n-1
        //[null,null,null]
        alunos[0]= aluno;
        alunos[1]= aluno2;
        alunos[2] = aluno3;
        Aluno[] novosAlunos = {aluno,aluno2,aluno3};
        Aluno[] novos2 = novosAlunos;
//        for(int i =0;i<alunos.length;i++){
//            System.out.printf("Nome: %s |Nota: %.2f\n", alunos[i].nome,alunos[i].nota);
//        }
        for(Aluno temp: alunos){
            System.out.printf("Nome: %s |Nota: %.2f\n", temp.nome,temp.nota);
        }

        for(Aluno temp: novosAlunos){
            temp.nome = temp.nome.toUpperCase();
        }
        System.out.println("===================");
        System.out.println("Nome: "  + alunos[0].nome);

        System.out.println("===================");
        System.out.println("Nome: "  + novos2[0].nome);
        //joao ? JOAO
        double soma = 0.0;
//
//        for (Aluno temp : alunos) {
//            soma += temp.nota;
//        }
//        double media = soma / alunos.length;
//        System.out.println(media);

        CalculadoraDeMedias calculadora = new CalculadoraDeMedias();
        double media = calculadora.calcularMediaAritmetica(alunos);
        System.out.println("Media da turma: " + media);
        double[] potencias =  calculadora.potenciaDe2(alunos);
        // alunos [0|1, 1|21,n|33]
        //potencias [0|1, 1|211, n|n2 ]
        //"Nome: " + "media: " + "potencia "
        for (int i=0;i<alunos.length;i++){
            System.out.printf("Nome: %s |Nota: %.2f |Potencia: %.2f \n",
                    alunos[i].nome,alunos[i].nota,potencias[i]);
        }
        System.out.println("===================");
        int contador = 0;
        for(Aluno temp : alunos){
            System.out.printf("Nome: %s |Nota: %.2f |Potencia: %.2f \n",
                    temp.nome,temp.nota,potencias[contador++]);
        }
    }
}
