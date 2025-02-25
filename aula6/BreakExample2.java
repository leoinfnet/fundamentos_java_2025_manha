package aula6;

public class BreakExample2 {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            System.out.println(i);
            if(i == 654) break;
        }
    }
}
