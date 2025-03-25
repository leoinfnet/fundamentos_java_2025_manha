package aula13;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Cachoro cachoro = new Cachoro("Bob");
        cachoro.latir();
        Gato gato = new Gato();
        System.out.println("============");
        Pitbull pitbull = new Pitbull("Cachorro");
        Pitbull pitbull2 = new Pitbull("Cachorr2");
        pitbull.latir();
        System.out.println(pitbull.toString());
        System.out.println(pitbull2.toString());
    }
}
