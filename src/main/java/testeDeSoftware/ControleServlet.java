
package testeDeSoftware;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controleServlet", urlPatterns = {"/inicial.html","/index.html","/cadastro-pessoas.html","/notas.html","/nota-detalhe.html","/nota-grafico.html"})
public class ControleServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>();
            rotas.put("/inicial.html", "testeDeSoftware.CommandInicial");
            rotas.put("/index.html", "testeDeSoftware.CommandIndex");
            rotas.put("/cadastro-pessoas.html", "testeDeSoftware.CommandCadastro");
            rotas.put("/notas.html", "testeDeSoftware.CommandNotas");
            rotas.put("/nota-detalhe.html", "testeDeSoftware.CommandNotasAlunos");
            rotas.put("/nota-grafico.html", "testeDeSoftware.CommandNotasGraficos");

        String clazzName = rotas.get(request.getServletPath());
          
        try {
            Comando comando = (Comando) Class.forName(clazzName).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            response.sendError(500, "Erro: " + ex);
            Logger.getLogger(ControleServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
                   Map<String, String> rotas = new HashMap<>();
        
        rotas.put("/index.html", "testeDeSoftware.CommandInicial");
        
        String clazzName = rotas.get(request.getServletPath());
          
        try {
            Comando comando = (Comando) Class.forName(clazzName).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            response.sendError(500, "Erro: " + ex);
            Logger.getLogger(ControleServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
