package aula10;

public class Surpresa {
    public static void main(String[] args) {
        int[] valores = {1,2,3};
        //Matriz
        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };
        int[][] matrizB = {
                {1,2,3},
                {4,5,6}
        };
        int[] ints = matriz[0];
        int[] ints2 = matriz[1];
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        for (int anInt : ints2) {
            System.out.println(anInt);
        }
        System.out.println("=====================");
        int valor = matriz[0][2];
        System.out.println(valor);
        System.out.println("=====================");
        int[][] resultados = new int[3][3];

        for(int i =0;i< matriz.length;i++){
            for(int j = 0;j<=matriz.length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
        for(int i =0;i< matriz.length;i++){
            for(int j = 0;j<=matriz.length;j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");

        for(int i =0;i<= matriz.length;i++){
            for(int j = 0;j<=matriz.length;j++){
                resultados[i][j] = matriz[i][j] + matrizB[i][j];
            }
        }

        for(int i =0;i< matriz.length;i++){
            for(int j = 0;j<=matriz.length;j++){
                System.out.print(resultados[i][j] + " ");
            }
            System.out.println();
        }



    }
}
