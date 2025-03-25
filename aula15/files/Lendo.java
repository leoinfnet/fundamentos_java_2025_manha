package aula15.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lendo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\leonardo.gloria\\IdeaProjects\\java_manha\\src\\aula15\\files\\temp\\teste.txt";        Path caminho = Paths.get(path);
        InputStream inputStream = Files.newInputStream(caminho);
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = null;
      //  String line = bufferedReader.readLine();
//        System.out.println(line);
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
        while((line = bufferedReader.readLine() )!= null){
            System.out.println(line);
        }
        inputStream.close();

    }
}
