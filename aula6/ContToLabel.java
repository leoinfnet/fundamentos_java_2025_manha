package aula6;

public class ContToLabel {
    public static void main(String[] args) {
        loopExterno:
        for(int i =0;i<10;i++){
            System.out.print("\nLoop externo " + i + ", Loop interno");
            for(int w = 0;w<10;w++){
                if(w == 5) continue loopExterno;
                System.out.println(w);
            }
        }
    }
}
