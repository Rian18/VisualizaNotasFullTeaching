package testeDeSoftware;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandNotasAlunos implements Comando {

    private List<Turma> lstTurma = new ArrayList<>();

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ManipulaJson mj = new ManipulaJson();
        lstTurma = mj.loadJSON();
        String nomeDisciplina = request.getParameter("nome");
        Turma turma = this.findById(nomeDisciplina);

        Operacao op = new Operacao();
        Double media = op.Media(turma.getLstAluno());
        AlunoNota menor = op.Menor(turma.getLstAluno());
        AlunoNota maior = op.Maior(turma.getLstAluno());
        op.Aprovados(turma.getLstAluno());
        op.Reprovados(turma.getLstAluno());
        
        Gson gson = new Gson();
        String alunosJson = gson.toJson(turma.getLstAluno());

        request.setAttribute("turmaAlunos", turma.getLstAluno());
        request.setAttribute("alunosJson", alunosJson);
        request.setAttribute("media", media);
        request.setAttribute("menor", menor);
        request.setAttribute("maior", maior);
        request.setAttribute("aprovados", op.Aprovados(turma.getLstAluno()));
        request.setAttribute("reprovados", op.Reprovados(turma.getLstAluno()));

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/nota-detalhe.jsp");
        despachante.forward(request, response);

    }

    public Turma findById(String nomeDisciplina) {
        for (Turma turma : lstTurma) {
            if (turma.getDisciplina().equals(nomeDisciplina)) {
                return turma;
            }
            
        }
        return null;
    }
}
