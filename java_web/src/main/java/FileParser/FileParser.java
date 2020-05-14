package FileParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entidade.Aluno;

public class FileParser {

    private static String fileName = "teste3.txt";


    public ArrayList<Aluno> readFile() throws IOException {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        try {
            FileReader fileReader = new FileReader(fileName);
            try(BufferedReader reader = new BufferedReader(fileReader)) {
                String aux = "";

                // percorre o arquivo
                while((aux = reader.readLine()) != null) {
                    String[] linha = aux.split(",");
                    Aluno aluno = new Aluno();
                    aluno.setNome(linha[0]);
                    aluno.setSexo(linha[1].charAt(0));
                    aluno.setNota1(Double.parseDouble(linha[2]));
                    aluno.setNota2(Double.parseDouble(linha[3]));
                    alunos.add(aluno);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return alunos;
    }
}