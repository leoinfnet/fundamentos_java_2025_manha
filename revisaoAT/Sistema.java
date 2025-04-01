package revisaoAT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema {
    private List<Funcionario> funcionarios;

    public Sistema() {
        funcionarios = new ArrayList<>();
    }
    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    public void exibirFuncionarios(){
        for(Funcionario f: funcionarios){
            System.out.println(f);
        }
    }


    public void calcularPagamento() {
        for(Funcionario funcionario: funcionarios){
            System.out.println("O pagamento de  "  + funcionario.getNome() +
                    " é: " + funcionario.calcularPagamento() );
        }
    }

    public void gerarRelatorio() throws IOException {
        String nomeArquivo = "relatorio_" + getDataHoraAtual() + ".txt";
        String path = "C:\\Users\\leonardo.gloria\\IdeaProjects\\java_manha\\src\\revisaoAT\\" + nomeArquivo;

        File file = new File(path);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("Relatorio de Pagamentos \n");
            writer.write("Gerado em : " + getDataHoraAtual() + "\n");
            for(Funcionario f: funcionarios){
                String linha = "Funcionario " + f.getNome() + " - Pagamento: " + f.calcularPagamento();
                writer.write(linha + "\n");

            }
            System.out.println("Relatorio gerado com sucesso");
            writer.close();
        }
    }

    private String getDataHoraAtual() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return simpleDateFormat.format(date);
    }
}
