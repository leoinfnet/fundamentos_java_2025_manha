package lista3.ex1;

public class Frase {
    String texto;
    public int contarOcorrenciesDaLetraA(){
        int contador = 0;
        for(int i=0;i<texto.length();i++){
            if(texto.charAt(i) == 'a'
                    || texto.charAt(i) == 'A'){
                contador++;
            }
        }
        return contador;
    }
    //TODO PARA FAZER
    public int contarOcorrencias(String caracter){
        int contador = 0;

        return 0;
    }
    public String substituir(String antigo,String novo){
        return texto.replace(antigo,novo);
    }
}
