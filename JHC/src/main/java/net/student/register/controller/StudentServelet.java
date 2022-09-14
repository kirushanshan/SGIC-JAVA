package net.student.register.controller;

import net.student.register.dao.StudentDAO;
import net.student.register.model.Student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServelet
 */
@WebServlet("/register")
public class StudentServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDAO studentDAO = new StudentDAO();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/studentregister.jsp");
		 dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age =  request.getParameter("age");
		String address = request.getParameter("address");
		String grade = request.getParameter("geade");
		
		Student student = new Student();
		
		student.setStudentNAme(name);
		student.setAge(Integer.parseInt(age));
		student.setAddress(address);
		student.setGrade(Integer.parseInt(grade));
		
		studentDAO.registerStudent(student);
		
		
		response.sendRedirect("");
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/studentdetails.jsp");
		 dispatcher.forward(request, response);
		
	}
	

}
