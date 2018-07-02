
package testeDeSoftware;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CommandNotasGraficos implements Comando{
    
    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Turma> lista = new ArrayList<>();
        
        
        Gson gson = new Gson();
        String TurmaAlunos = gson.toJson(lista);
        System.out.print(TurmaAlunos);
        request.setAttribute("turmaAlunosJson", TurmaAlunos);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/nota-grafico.jsp");
        despachante.forward (request, response);
    }
        
        
        
}
