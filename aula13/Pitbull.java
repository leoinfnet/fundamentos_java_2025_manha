package aula13;

public class Pitbull extends Cachoro{
    public Pitbull(String nome) {
        super(nome);
        System.out.println("Criando um Pitbull");
    }
    @Override
    public void latir() {
        super.latir();
        System.out.println("Latido de pitbull");
    }
    public String toString(){
        return "Nome do Pitbull: " + getNome();
    }


}
