class Notas {
    public static void main(String [] args){
        float nota = 0.0;
        boolean notaValida = !(nota > 10 || nota < 0);
        if(notaValida){
            if(nota >= 9) {
                System.out.println("Aprovado com Louvor!"); // Maior que 9
            }else  if(nota >= 7){
                System.out.println("Aprovado!"); // Maior que 7    
            }else if (nota >= 5 ) {
                System.out.println("Recuperacao!"); //Maior que 5    
            }else if(nota < 5) {
                System.out.println("Reprovado!"); // Menor que 5
            }
        }else System.out.println("Nota inválida!");
    
    }    
}
    