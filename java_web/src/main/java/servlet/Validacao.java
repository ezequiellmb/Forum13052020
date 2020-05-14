package servlet;

import FileParser.FileParser;
import entidade.Aluno;

import java.io.IOException;
import java.util.ArrayList;

public class Validacao {
    public double media;
    int i;

    public double mediatotal() {
        FileParser fp = new FileParser();
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {
                media = (aluno.getNota1() + aluno.getNota2())/2;
                i = i+1;
            });
            media = media/i;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

}
