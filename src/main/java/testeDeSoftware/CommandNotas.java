package testeDeSoftware;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandNotas implements Comando {

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Turma> lstTurma = new ArrayList<>();
        ManipulaJson mj = new ManipulaJson();
        lstTurma = mj.loadJSON();
        request.setAttribute("turmaAlunos", lstTurma);        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/notas.jsp");
        despachante.forward(request, response);

    }

}
