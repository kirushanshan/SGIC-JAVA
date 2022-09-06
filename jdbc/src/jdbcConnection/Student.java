package jdbcConnection;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Student {
	
	private static Scanner in = new Scanner(System.in);
	
	 static void selection(int select) {
		 	

			switch(select) {
			  case 1:
				 addDatabase();
			    break;
			  case 2:
			    viewData();
			    break;
			  case 3:
				  viewIndivualData(); 
			  case 4:
				  System.exit(0);
			  default:
				
			}
		}
		 
		 static void selection() {
			 System.out.println("Enter Your selection \n1 -: add student database \n2 -: view student database\n3 :- view indivual student detail \n4 -: Exit program");
				int select=Integer.parseInt(in.nextLine());
				selection(select);
			 
		 }
			
			static void addDatabase() {

				System.out.println("Enter Student Name");
				String userName = in.nextLine();
				
				System.out.println("Enter Student Address");
				String address = in.nextLine();
				
				System.out.println("Enter Student Class");
				String password = in.nextLine();
				
				Connection conn = DatabaseConnection.getConnection();
				
				try {
					
					
					PreparedStatement ps = conn.prepareStatement("INSERT INTO `register` (name,address,password) VALUE (?,?,?);");			
					ps.setString(1, userName);
					ps.setString(2, address);
					ps.setString(3, password);
					int affected = ps.executeUpdate();
					
					if(affected == 1) {
						System.out.println("Updated Sucess fully\n");
					}
				
					
					conn.close();
					
					selection();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				
			}
			
			
			
		 static void viewData() {
		     try {

		    	 Connection conn = DatabaseConnection.getConnection();

		         PreparedStatement ps = conn.prepareStatement("SELECT * FROM register");
		         ResultSet rs = ps.executeQuery();
		         int i = 0;
		         while (rs.next()) {
		         	
		         	System.out.println("Student id : " + rs.getInt("id"));
		         	System.out.println("name : " + rs.getString("name"));
		         	System.out.println("Address : " + rs.getString("address"));
		         	System.out.println("Class : " + rs.getString("password"));
		         	System.out.println(" --------------------------------------------  ");
		         	System.out.println();
		         	
		         }
		         conn.close();
		         selection();
		     }
		     catch (Exception e) {
		     	System.out.println(e);
		     	
		     }
		     
		    
		 }
			

			static void viewIndivualData() {
				System.out.println("\nEnter Student Number ");
			     int stdNumber=Integer.parseInt(in.nextLine());
			     
			   
			     
			     try {

			    	 Connection conn = DatabaseConnection.getConnection();

			         PreparedStatement ps = conn.prepareStatement("SELECT * FROM `register` WHERE id = ?;");
			         ps.setInt(1, stdNumber);
			         ResultSet rs = ps.executeQuery();
			         
			         
			         if (rs.next()) {
			        	 	System.out.println("\nid : " + rs.getInt("id"));
			        	 	System.out.println("name : " + rs.getString("name"));
				         	System.out.println("Address : " + rs.getString("address"));
				         	System.out.println("Class : " + rs.getString("password"));
				         	System.out.println(" --------------------------------------------  ");
				         	System.out.println();
			         }
			         else {
			        	 System.out.println("Student id not found\n");
			         }
			         	
			         	
			         	
			         conn.close();
			         
			         selection();
			     }
			     catch (Exception e) {
			     	System.out.println(e);
			     	
			     }
			     
			     
			     
			     
			}

}
