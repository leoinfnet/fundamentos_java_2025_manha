class Ex3 {
    public static void main(String [] args){
        int numero = 10;
        int intervalorInferior = 10;
        int intervalorSuperior = 20;
        boolean estaNoIntervalo = (numero <= intervalorSuperior && numero >= intervalorInferior);
        if(estaNoIntervalo){
            // System.out.println("O numero: " + numero + "Esta dentro do intervalor de [" + in ,20]") ----> Mais chato de escrever
            System.out.printf("O numero: %d esta dentro do intervalo [%d,%d]", numero, intervalorInferior,intervalorSuperior);
        }else {
            System.out.printf("O numero: %d nao esta dentro do intervalo [%d,%d]", numero, intervalorInferior,intervalorSuperior);
        }
    }
}