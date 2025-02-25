package aula9;

public class Strings1 {
    public static void main(String[] args) {
        String texto = "\n" +
                "Toda pessoa que já leu um número suficiente de livros, em algum momento, se deparou com determinada passagem que parece ter sido escrita para si própria. Obviamente, os livros não são apenas para confirmar os sentimentos e experiências de mundo que carregamos dentro de nós mesmos, mas é inegável que um de seus efeitos é justamente esse de fazer ressonância com nosso próprio jeito de ser e, consequentemente, nos maravilhar por esse reconhecimento num outro que muitas vezes é apenas ficcional.\n" +
                "\n" +
                "Como bem descreve Michèle Petit em “A Arte de Ler ou Como Resistir à Adversidade”, eu expressaria essa sensação com suas palavras: “uma felicidade em encontrar palavras à altura do sentimento que se experimenta.” E, daí, surgiu também a ideia desse meu post, dada à necessidade de trazer algumas dessas passagens que provocaram tal ressonância em mim. Nada mais que “um desejo de compartilhar, de levar correndo ao outro o que se descobriu”.\n" +
                "\n" +
                "Assim, pretendo com esse post não apenas deixar soltos alguns trechos de livros, mas também falar um pouco sobre mim, essa pessoa por trás das leituras. Quem se identificar, por favor, me diga se temos algo em comum além da paixão pelos livros!";

        //Pattern Flyweight
        int a = 5;
        int b = 5;
        char c1 = 'a';
        char c2= 'a';
        if(a == b) System.out.println("a == b");
        if(c1 == c2) System.out.println("c1 == c2");

        Aluno a1 = new Aluno();
        a1.nome = "Leonardo";

        Aluno a2 = new Aluno();
        a2.nome = "Leonardo";

        if(a1 == a2) {
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
        String s1 = "Leonardo";
        String s2 = "Leonardo";
        if(s1 == s2 ){
            System.out.println("Strings Iguais");
        }
        String s3 = new String("Leonardo");
        if(s1 == s3){
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
    }
}
