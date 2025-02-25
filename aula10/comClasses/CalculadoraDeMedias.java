package aula10.comClasses;

public class CalculadoraDeMedias {
    double calcularMediaAritmetica(Aluno[] alunos){
        double soma= 0.0;
        for (Aluno temp : alunos) {
            soma += temp.nota;
        }
        double media = soma / alunos.length;
        return media;
    }
    double[] potenciaDe2(Aluno[] alunos){
        double[] potencias = new double[alunos.length];
        //[1,2,3] append(5) = [1,2,3,5]
        int contador =0;
        for(Aluno temp: alunos){
            potencias[contador] = Math.pow(temp.nota, 2);
            ++contador; //contador++;
        }
        return potencias;
    }
}
