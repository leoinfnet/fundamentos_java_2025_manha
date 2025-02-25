package aula10;

public class PercorrendoComClasses {
    public static void main(String[] args) {
        String[] alunos = {"joao", "pedro", "jose"};
        for(int i=0;i<alunos.length;i++){
            System.out.println("Nome:" + alunos[i]);
        }
        System.out.println("====================");
        for(String aluno:alunos){
            System.out.println(aluno.toUpperCase());
        }
    }
}
