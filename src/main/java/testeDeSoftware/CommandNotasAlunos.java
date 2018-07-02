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

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File caminho = new File("C:/Users/Rian Alves/Desktop/arquivo1.json");
        ManipulaJson mj = new ManipulaJson();
        Turma turma = new Turma();
        turma = mj.loadJSON(caminho);
        List<AlunoNota> lista = new ArrayList<>();
        lista = turma.getLstAluno();

        Operacao op = new Operacao();
        Double media = op.Media(lista);
        AlunoNota menor =op.Menor(lista);
        AlunoNota maior =op.Maior(lista);
       // op.Aprovados(lista);
        //op.Reprovados(lista);

        request.setAttribute("turmaAlunos", lista);
        request.setAttribute("media", media);
        request.setAttribute("menor", menor);
        request.setAttribute("maior", maior);
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/nota-detalhe.jsp");
        despachante.forward(request, response);

    }

}
