
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public Connection conetaBD(){
        Connection conn = null;
        
        try { 
          String url = "jdbc:mysql://localhost3306/bancosig|user=root&password=123";  
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"conexaoDAO:"+ erro);
        }
        return conn;
    }
    
}
