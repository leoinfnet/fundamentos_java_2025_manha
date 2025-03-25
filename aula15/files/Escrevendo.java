package aula15.files;

import jdk.dynalink.StandardOperation;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Escrevendo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\leonardo.gloria\\IdeaProjects\\java_manha\\src\\aula15\\files\\temp\\teste.txt";
        Path pasta = Paths.get(path);
        InputStream inputStream = Files.newInputStream(pasta);
        OutputStream outputStream = Files.newOutputStream(pasta, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        outputStream.write("\nLeonardo".getBytes());


        try(OutputStream stream =
                    new BufferedOutputStream(Files.newOutputStream(pasta,StandardOpenOption.APPEND))){
            stream.write("\nTest232132131".getBytes());
        }
    }
}
