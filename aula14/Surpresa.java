package aula14;

public abstract class Surpresa implements Administravel {
    public abstract void foo();
    public  void bar(){
        System.out.println("Bar");
    };

    @Override
    public void administra() {

    }
}
