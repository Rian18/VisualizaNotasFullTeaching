    
package testeDeSoftware;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DisciplinaDAO {
          
    private static Connection conexao;
    private static DisciplinaDAO instancia;

    public static DisciplinaDAO getInstance() {
        if (instancia == null) {
            instancia = new DisciplinaDAO();
        }
        return instancia;
        
    }

    public DisciplinaDAO() {
        try {
            if (conexao == null) {
                conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/teste-software", "usuario", "senha");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

   

    

