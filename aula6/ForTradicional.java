package aula6;

public class ForTradicional {
    public static void main(String[] args) {

//        for(int i=0;i<5000;i++){
//               System.out.println(i);
//        }

//        for(int j=10;j>0;j--){
//            System.out.println(j);
//        }
        int valorAlto = 1_000_000;
        int soma = 0;
        for(int i = 0;i<=100_000;i++){
            soma += i;
            //soma = soma + i // Mesma coisa
        }

       // System.out.println(soma);
        for(int count = 10; count<5;count++){
            System.out.println(count); //Nunca sera executado pois a expressao eh verificada antes
        }
        int j,k;
        int z = 100;
        for(j=0,k=10;j<k;j++,k--,z--){
            System.out.println("J e K e Z:"+ j + " " + k + " " + z);
        }
        boolean continua = true;
        for(int i=0;continua;i++){
            System.out.println(i);
            if(i > 10){
                continua = false;
            }
        }
        System.out.println("=========================");
        int y = 0;
        for(;y<10;y++){
            System.out.println(y);
        }
        System.out.println("=========================");
//        for(;;){
//            System.out.println("Infinito");
//        }
        //For infinito
        int soma3 = 0;
        for(int i = 0;i < 100; soma3 += i++);
        System.out.println(soma3);

        System.out.println("=========================");
        for(int i = 0;i<=100;i +=2){
            System.out.println(i);
            //0 2 4 6 9
        }
        for(int i =1000;i>=0;i--){
            System.out.println(i);
        }
       }
}
