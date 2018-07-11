package testeDeSoftware;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rian Alves
 */
public class ManipulaJson {

    public String createJSON() throws IOException {
        Turma turma = new Turma();
        AlunoNota aluno1 = new AlunoNota(1, "Maria das Dores", 75.1);
        AlunoNota aluno2 = new AlunoNota(2, "Maria das Neves", 79.1);
        List<AlunoNota> lstAluno = new ArrayList<>();
        lstAluno.add(aluno1);
        lstAluno.add(aluno2);
        turma.setId(1);
        turma.setDisciplina("Fisica");
        turma.setProfessor("Jorge");
        turma.setLstAluno(lstAluno);

        Gson gson = new Gson();
        String json = gson.toJson(turma);
        System.out.println(json);

        FileWriter writeFile = null;

        writeFile = new FileWriter("C:/Users/Rian Alves/Desktop/arquivo1.json");
        writeFile.write(json);
        writeFile.close();

        return json;
    }

    public List<Turma> loadJSON() throws FileNotFoundException, MalformedURLException, IOException {
        URL url = new URL("http://146.48.84.228/testesw2018/grupo5.php?acao=1");
        Scanner scanner;
        scanner = new Scanner(url.openStream());
        String json = scanner.next();
        while (scanner.hasNext()) {
            json += " " + scanner.next();
        }
        System.out.println(json);
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Turma>>() {
        }.getType();
        List<Turma> turma = gson.fromJson(json, listType);
        for (int i = 0; i < turma.size(); i++) {
            System.out.println(turma.get(i).getProfessor());
            System.out.println(turma.get(i).getDisciplina());
            for (AlunoNota aluno : turma.get(i).getLstAluno()) {
                System.out.println(aluno.getId());
                System.out.println(aluno.getNome());
                System.out.println(aluno.getNota());

            }
        }
        return turma;
    }
}
