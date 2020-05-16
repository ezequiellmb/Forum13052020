package servlet;

import FileParser.FileParser;
import entidade.Aluno;

import java.io.IOException;
import java.util.ArrayList;

public class Validacao {
    public double media;
    int i = 0;
    double total;
    double maior;
    String nome;

    public double mediatotal() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {

                media = (aluno.getNota1() + aluno.getNota2()) / 2;
                total += media;
                i += 1;
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

    public double mediaHomem() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;

        try {
            ArrayList<Aluno> alunos = fp.readFile();
            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'm' || aluno.getSexo() == 'M') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    total += media;
                    i += 1;
                }
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }

    public double mediaMulher() {
        FileParser fp = new FileParser();
        total = 0;
        i = 0;
        media = 0;

        try {
            ArrayList<Aluno> alunos = fp.readFile();
            alunos.forEach(aluno -> {
                if (aluno.getSexo() == 'F' || aluno.getSexo() == 'f') {
                    media = (aluno.getNota1() + aluno.getNota2()) / 2;
                    total += media;
                    i += 1;
                }
            });
            media = total / i;

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return media;
    }
    public double maiorMedia(){
        FileParser fp = new FileParser();
        media = 0;
        maior = 0;
        nome = "";
        try {
            ArrayList<Aluno> alunos = fp.readFile();

            alunos.forEach(aluno -> {

                media = (aluno.getNota1() + aluno.getNota2()) / 2;

                if(media > maior){
                    maior = media;
                    nome = aluno.getNome();
                }
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return maior;
    }
}