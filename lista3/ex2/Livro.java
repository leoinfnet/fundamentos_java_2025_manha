package lista3.ex2;

public class Livro {
    String titulo;
    String autor;
    int ano;
    Livro(String titulo, String autor,int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("====== Livro =======");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("====================");
    }
}
