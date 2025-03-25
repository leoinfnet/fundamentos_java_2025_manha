package aula14.surpresa;

public class Tarefa {

    //1pendente, 2em andamento , 3concluida, 4cancelada, 5RECUSADO

    public Tarefa(String descricao, Status status) {
        this.descricao = descricao;
        this.status = status;
    }
    public void avancaStatus(){
        if(this.status == Status.PENDENTE){
            this.status = Status.EM_PROGRESSO;
        }else if (this.status == Status.EM_PROGRESSO){
            this.status = Status.CONCLUIDA;
        }
    }
    public void cancelaTarefa(){
        this.status = Status.ERRO;
    }

    private String descricao;
    private Status status;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }


    public void setStatusComoNumero(int status) {
        if(status > 0 && status < 5){
            //Status validp
        }else {
            //Status invalido
        }
    }

}
