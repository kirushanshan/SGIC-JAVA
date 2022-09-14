package net.student.register.dao;

import net.student.register.dao.DatabaseConnection;
import net.student.register.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
	


	Connection conn  = DatabaseConnection.getConnection();
	
	public int registerStudent(Student student) {
		try {
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO `student_details` (name,age,address,grade) VALUE (?,?,,?,?);");			
		ps.setString(1, student.getStudentNAme());
		ps.setInt(2, student.getAge());
		ps.setString(3, student.getAddress());
		ps.setInt(3, student.getGrade());
		
		int affected = ps.executeUpdate();
		
		if(affected == 1) {
			conn.close();
			return 1;
		}
	
		
		conn.close();
		return 0;
	
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return 1;
	}
	


}
