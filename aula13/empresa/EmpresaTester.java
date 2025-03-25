package aula13.empresa;

public class EmpresaTester {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("RH",2000);
        gerente.setSalario(15_000);
        gerente.getBonificacao();
        System.out.println(gerente);
        Gerente gerente2 = new Gerente("RH",2000);
        gerente2.setSalario(15_000);
        gerente.setNome("Leonardo");
        gerente2.setNome("Leonardo");

        System.out.println(gerente == gerente2);

        System.out.println(gerente.equals(gerente2));
        System.out.println("Teste".equals("Teste"));


    }
}
