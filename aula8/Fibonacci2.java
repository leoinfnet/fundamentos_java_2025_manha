package aula8;

public class Fibonacci2 {
    int fibonacci(int n){
        if (n <=1 ){
            return n;
        }
        return fibonacci(n - 1);
    }
}
