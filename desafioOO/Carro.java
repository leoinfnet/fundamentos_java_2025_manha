package desafioOO;

public class Carro {
    private String marca;
    private String modelo;
    private static Carro carro = null;
    private Carro() {
    }
    public static Carro getCarro(){
        if(carro == null){
            //Nao esta instanciado
            carro = new Carro();
        }
        return carro;
    }
}
