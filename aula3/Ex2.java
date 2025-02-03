class Ex2 {
    public static void main(String [] args){
        short idade = 50;
        boolean conviteValido = true;
        boolean maiorIdade = (idade >= 18);    
        if(maiorIdade && conviteValido){
              System.out.println("Voce pode entrar na festa");   
        }else {
            System.out.println("Voce nao pode entrar na festa");    
        }
    }
}