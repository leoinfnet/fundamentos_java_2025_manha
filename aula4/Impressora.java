class Impressora {
    public static void main(String [] args){
        System.out.println("Com quebra de linha");
        System.out.println("Com quebra de linha");

        System.out.print("Com quebra de linha");
        System.out.print("Com quebra de linha");

        System.out.println(); // Imprime linha em branco

        //%s => Texto
        //%d para Inteiros [short,int]
        //%f para ponto flutuante [float,double]
        System.out.printf("Ola Sr %s %n Sua nota foi: %d ", "Leonardo",75);
    }
}