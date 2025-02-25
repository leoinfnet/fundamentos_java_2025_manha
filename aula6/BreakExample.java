package aula6;

public class BreakExample {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            System.out.println("Contagem Loop Externo " + i);
            System.out.println("Contagem Loop Interno");
            int t = 0;
            while(t < 30){
                System.out.println("t: " + t );
                t++;
                break;
            }
            System.out.println();
            System.out.println("Loop Completo");
        }
    }
}
