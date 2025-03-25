package aula13;

public class Cachoro extends Mamifero{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachoro(String nome) {
        this.nome = nome;
        System.out.println("Criando um Cachorro com nome: " + nome);
    }
    public void latir(){
        System.out.println("Au do cachorro");
    }
}
