package net.student.register.model;

public class Student {
	int studentId;
	String studentNAme;
	int age;
	String Address;
	int grade;
	
	
	
	
	public Student(int studentId, String studentNAme, int age, String address, int grade) {
		super();
		this.studentId = studentId;
		this.studentNAme = studentNAme;
		this.age = age;
		Address = address;
		this.grade = grade;
	}
	
	
	public Student() {

	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentNAme() {
		return studentNAme;
	}
	public void setStudentNAme(String studentNAme) {
		this.studentNAme = studentNAme;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
