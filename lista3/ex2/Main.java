package lista3.ex2;

public class Main {
    public static void main(String[] args) {
        Livro lotr = new Livro("O Senhor dos anéis",
                "J.R.R. Tolkien",1954);
        Livro mil = new Livro("1984", "George Orwell", 1949);
        Livro domCasmurro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro harry = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        Livro bladeRunner = new Livro("Blade Runner", "Philip K. Dick", 1962);

        Livro[] livros = new Livro[5];
        livros[0] = lotr;
        livros[1] = mil;
        livros[2]= domCasmurro;
        livros[3]= harry;
        livros[4]= bladeRunner;

        Livro[] livros1 = {lotr,mil,domCasmurro,harry,bladeRunner };

//        for(int i=0;i< livros.length;i++){
//            livros[i].exibirInfo();
//        }
        for(Livro livro: livros){
            livro.exibirInfo();
        }


    }
}
