
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class ConexaoDAO {
    
    public Connection conetaBD(){
        Connection conn = null;
        
        try { 
            //trocar o sinal de | depois da porta 3306 pela interaogacão
          String url = "jdbc:mysql://localhost:3306/bancosig?user=root&password=123";  
          conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) { //Execão de SQL
            JOptionPane.showMessageDialog(null,"conexaoDAO:"+ erro.getMessage());
        }
        return conn;
    }
    
}
