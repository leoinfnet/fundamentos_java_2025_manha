package aula10;

public class Declarando {
    public static void main(String[] args) {
        int[] meyArray1 = {1,5,-6,12000};
        double[] meuArray2;
        boolean[] meuArray3 = {true,false,false};

        String[] nomes  = new String[10];
        boolean[] notas = new boolean[100];

        System.out.println(meyArray1[0]);
        System.out.println(meyArray1[1]);
        System.out.println(meyArray1[2]);
        System.out.println(meyArray1[3]);
        //System.out.println(meyArray1[4]); //Array out of bounds -- tem 4 posicoes
        //System.out.println(meuArray2[1]); // Erro pois nao esta inicializado
        System.out.println("==================");
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println("==================");
        String[] nomes2 = {"Leo","joao", "pedro"};
        System.out.println(nomes2[1].toUpperCase());
        System.out.println("==================");
        System.out.println("Tamanho do Array Notas: " + notas.length);
        System.out.println("==================");

//        for(int i=0;i<nomes2.length;i++){
//            nomes2[i]= "Teste=>" + i ;
//            //System.out.println(nomes2[i]);
//        }
        for(int i=0;i<nomes2.length;i++){
            nomes2[i] = nomes2[i].toUpperCase();
        }
        System.out.println(nomes2[0]);
        System.out.println(nomes2[1]);

    }
}
