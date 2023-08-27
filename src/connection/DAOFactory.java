package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {
    
    public static Connection getConexao() throws SQLException {
        String usuario = "zina";
        String senha = "asdnjafdnjadf";
        String url = "jdbc:mysql://localhost:3306/biblioteca";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco de dados.");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }   
        
    }
    
}
