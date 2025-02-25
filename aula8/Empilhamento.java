package aula8;

public class Empilhamento {
    void funcao1(){
        System.out.println("inicio funcao1");
        funcao2();
        System.out.println("fim funcao1");
    }
    void funcao2(){
        System.out.println("inicio funcao2");
        funcao3();
        System.out.println("fim funcao2");
    }
    void funcao3(){
        System.out.println("inicio funcao3");
        System.out.println("fim funcao3");
    }

}
