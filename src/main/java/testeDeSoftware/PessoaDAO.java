
package testeDeSoftware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PessoaDAO {
          
    private static Connection conexao;
    private static PessoaDAO instancia;

    public static PessoaDAO getInstance() {
        if (instancia == null) {
            instancia = new PessoaDAO();
        }
        return instancia;
        
    }

    public PessoaDAO() {
        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/teste-software", "usuario", "senha");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}