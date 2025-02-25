package aula8;

public class CalculadoraDeFibonacci {
    //0,1,1,2,3
    long calcular(long n){
        int a = 0, b= 1;
        if(n <= 1) return n;
        for(int i = 2; i <=n; i++){
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
    void imprimirASequencia(int n) {
        long a = 0,b = 1;
        for(int i =0; i < n ; i++){
            System.out.print(a + ", ");
            //0,1,1
            long next = a + b;
            //1,2
            a = b;
            b = next;
            //0,1,1,2,3,5,8,13,21
            //, , a b
            //next = 1
        }
    }
    int fibonacci(int n){
        if (n <=1 ){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
