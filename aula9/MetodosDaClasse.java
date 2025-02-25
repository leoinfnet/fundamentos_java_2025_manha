package aula9;

import java.util.Scanner;

public class MetodosDaClasse {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String primeiroNome = "Leonardo", segundoNome = "Gloria";
        String outroNome= "Leonardo";
        String espaco = " ";
        String nomeCompleto = primeiroNome + espaco +  segundoNome;
        System.out.println(nomeCompleto);

        String concatenado = primeiroNome.concat(segundoNome);
        primeiroNome= primeiroNome.concat(segundoNome);
        System.out.println(primeiroNome);
        //Objetos da Classe String são imutáveis

        String pedro = "Pedro".concat(" Silva").concat(" Oliveira");
        System.out.println(pedro);
        int tamanho = pedro.length();
        System.out.printf("O tamanho da String: %s eh: %d\n", pedro,tamanho);
        System.out.println("Teste".length());

        System.out.printf("O caractere 1 eh: %s\n", pedro.charAt(1));
        char primeiraLetra = pedro.charAt(0);
        if(primeiraLetra == 'P'){

        }
        if(pedro.charAt(0) == 'P'){
            System.out.println("Comeca com P");
        }
        String comeco  = "Leo";
        //"Leonardo Gloria" -> "Leo";
//        boolean iguais = true;
//        for(int i =0;i<=comeco.length();i++){
//            if(!(nomeCompleto.charAt(i) == comeco.charAt(i))){
//                iguais = false;
//            }
//        }
//      if(iguais) System.out.println("Iguais");
        boolean comecaCom = nomeCompleto.startsWith("Leo");
        nomeCompleto.toLowerCase().startsWith("Leo".toLowerCase()); //"leonardo gloria"
        //leonardo gloria comeca com leo
        boolean terminaCom = nomeCompleto.endsWith("gloria");
        System.out.println("======================");
        //String digitado = leitor.next().toUpperCase();
        String digitado = "GlOrIa".toUpperCase();

        if(nomeCompleto.toUpperCase().endsWith(digitado)){
            System.out.printf("%s termina com %s\n", nomeCompleto,digitado);
        }else {
            System.out.println("Nao termina");
        }
        // "Gloria" == "gloria" ?? false
        String nome2 = "Pedro Silva de Oliveira!";
        //String nomeTrocado = nome2.replace("Oliveira", "Silveira");
        //System.out.println(nomeTrocado);

        //"Joao da Rocha" -> Joao da Silva
        System.out.println(nome2.indexOf("e"));
        System.out.println(nome2.indexOf("e",4));
        System.out.println(nome2.indexOf("%"));
        System.out.println(nome2.lastIndexOf("e"));
        System.out.println(nome2.lastIndexOf("e",5));

        String daInternet = "Nome:Leonardo Gloria    ";
        String daInternet2 = "Nome:Pedro Da Silva   ";
//        for(int i =0;i<daInternet2.length();i++){
//            if(i >=5) System.out.print(daInternet2.charAt(i));
//        }

        System.out.println(daInternet.substring(5));
        System.out.println(daInternet2.substring(5));
        System.out.println(daInternet.substring(5,10));
        String daInternetTratado = daInternet.substring(5);
        System.out.println(daInternetTratado.replace(" ", ""));
        System.out.println(daInternetTratado.trim());

        boolean iguais = daInternetTratado
                .trim()
                .toLowerCase().endsWith("Gloria".toLowerCase());
        if(iguais){
            System.out.println("Termina Com");
        }
        String aluno1 = "Joao da Silva";
        String aluno2 = "Joao Oliveira";
        String aluno3 = "Julio Oliveira";

        int posicaoDoEspaco = aluno3.indexOf(" ");
        String primeiroNomeAluno1 = aluno1.substring(0,posicaoDoEspaco);
        String primeiroNomeAluno2 = aluno2.substring(0,posicaoDoEspaco);
        String primeiroNomeAluno3 = aluno3.substring(0,posicaoDoEspaco);

        System.out.println(primeiroNomeAluno1);
        System.out.println(primeiroNomeAluno2);
        System.out.println(primeiroNomeAluno3);

        int posicaoDoUltimoEspaco = aluno1.lastIndexOf(" ");
        System.out.println(posicaoDoUltimoEspaco);
        String ultimoNome = aluno1.substring(posicaoDoUltimoEspaco);
        System.out.println("ultimo nome: " + ultimoNome.trim());


        if(primeiroNomeAluno1.equals(primeiroNomeAluno2)){
            System.out.println("Iguais");
        }
        if(primeiroNomeAluno1.equals(primeiroNomeAluno3)){
            System.out.println("Iguais");
        }
        if (aluno1 == aluno2){} //Nao Usar
        if(aluno1.equals(aluno2)){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
        //System.out.println("Digite o nome do primeiro aluno: ");
        //String aluno3 = leitor.next();
        //System.out.println("Digite o nome do segundo aluno: ");
        //String aluno4 = leitor.next();

        Aluno aluno = new Aluno();
        aluno.nome = "Leonardo Gloria";

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Leonar Silveira";

        System.out.println("Nomes iguais : " + aluno.primeiroNomeIgual(aluno5.nome));

    }
}
