package aula14.surpresa;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Cadastrar aluno", Status.PENDENTE);
        Tarefa tarefa2 = new Tarefa("Comprar Refrigerante", Status.ERRO);
        Tarefa tarefa3 = new Tarefa("Comprar Refrigerante", Status.CONCLUIDA);

        tarefa.avancaStatus();

        System.out.println(tarefa.getStatus().getMessage());
        System.out.println(tarefa2.getStatus());
        System.out.println(tarefa3.getStatus());

    }
}
