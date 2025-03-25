package aula15;

import java.io.FileNotFoundException;

public class TesteFiles {
    public static void main(String[] args) throws FileNotFoundException {
       metodo1();
    }
    static void metodo1() throws FileNotFoundException{
            new java.io.FileInputStream("teste.txt");
    }
}
