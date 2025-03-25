package aula14.surpresa;

public enum Status {
    PENDENTE("Tarefa Pendente"),EM_PROGRESSO("Tarefa sendo executada")
    ,CONCLUIDA("Uhull, Concluida!"),ERRO("Ops com Erro :|");

    Status(String message) {
        System.out.println("Criando enum + " + message);
        this.message = message;
    }
    private String message;
    String getMessage(){
        return this.message;
    }
}
