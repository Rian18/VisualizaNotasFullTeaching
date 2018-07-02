
package testeDeSoftware;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

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

    public Turma loadJSON(File caminho) throws FileNotFoundException {
        Reader reader = new FileReader(caminho);
        //String reader = json1;
        Gson json = new Gson();
        Turma turma = json.fromJson(reader, Turma.class);

        for (AlunoNota aluno : turma.getLstAluno()) {
            System.out.println(aluno.getId());
            System.out.println(aluno.getNome());
            System.out.println(aluno.getNota());

        }
        return turma;
    }
}
