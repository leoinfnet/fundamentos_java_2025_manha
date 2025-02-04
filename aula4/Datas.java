import java.util.Scanner;
class Datas {
    public static void main(String [] args){
        boolean dataValida = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o mes (1 a 12): ");
        int mes = scanner.nextInt();
        System.out.println("Digite o dia (1 a 31): ");
        int dia = scanner.nextInt();

        boolean mesInvalido = (mes < 1 || mes > 12);
        boolean mesDe31Dias = (mes == 1 || mes == 3 || mes == 5 
                    || mes == 7  || mes == 8 || mes == 10 || mes == 12);
        boolean mesDe30Dias = (mes == 4 || mes == 6 || mes == 9 || mes == 11);
        boolean anoBissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
        if(mesInvalido){
            dataValida = false;
        }else {
            if(mesDe31Dias)  dataValida = (dia >= 1 && dia <= 31);
            else if( mesDe30Dias) dataValida = (dia >= 1 && dia <= 30);
            else {
                if(anoBissexto) dataValida=  (dia >= 1 && dia <= 29);
                else dataValida=  (dia >= 1 && dia <= 28);
            }
        }
        System.out.printf("Data ===> %d/%d/%d %n%n", dia,mes,ano);
        if(dataValida) System.out.println("Data Valida!");
        else  System.out.println("Data Invalida!"); 



        
    }
}