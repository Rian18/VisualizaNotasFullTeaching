
package testeDeSoftware;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CommandNotasGraficos implements Comando{
    
    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/nota-grafico.jsp");
        despachante.forward (request, response);
    }
        
        
        
}
