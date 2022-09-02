package jdbcConnection;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	
     
	 public static Connection getConnection () {
		 Connection conn = null; 
		 
		 String url = "jdbc:mysql://localhost:3306/test";
		 String user = "root";
		 String password = "";
		 
	     try{
	    	 conn = DriverManager.getConnection(url, user, password);

	 	    if (conn != null) {
	 	        
	 	     
	 	    }
	 	} catch (SQLException ex) {
	 	    System.out.println("Server not conected");
//	 	    ex.printStackTrace();

	 	}
	     
	     return conn;
		 
	 }

}

