package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Connection connection = null;  
                String url = "jdbc:sqlite:C:/Users/Guilherme/Downloads/programas/sqlite-tools-win32-x86-3420000/sqlite-tools-win32-x86-3420000/database";
            
                try {     

                    connection = DriverManager.getConnection(url);
                    Statement statement = connection.createStatement();
                    statement.setQueryTimeout(30);
                                        
                    statement.executeUpdate("INSERT INTO usuarios VALUES('Guilherme', 'Guilherme@email.com')");
                    statement.executeUpdate("INSERT INTO usuarios VALUES('Glauco', 'Glauco@email.com')");
                    statement.executeUpdate("INSERT INTO usuarios VALUES('Carlos', 'Carlos@email.com')");
                    statement.executeUpdate("INSERT INTO usuarios VALUES('Gustavo', 'Gustavo@email.com')");
                    ResultSet rs = statement.executeQuery("SELECT * FROM usuarios");
                    
                    while(rs.next()) {
                        System.out.println("nome: " + rs.getString("nome"));
                        System.out.println("email: " + rs.getString("email"));    
                    }   
                                                  
                }catch(SQLException e) {
                       System.err.println(e.getMessage());
                }
                finally {
                    try {
                        if(connection != null){
                            connection.close();
                        }
                    }catch(SQLException e) {
                            System.err.println(e.getMessage());
                    }
            }
                
	}
 
}