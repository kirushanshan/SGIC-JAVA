package Lampda;

import java.util.ArrayList;
import java.util.List;

public class Person {
	 enum Sex {
		Male,Female
	}
	
	String Name;
	int age;
	String emailAddress;
	Sex gender;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	
	
	public Person() {

	}
	
	public Person(String name, int age, String emailAddress, Sex gender) {
		super();
		Name = name;
		this.age = age;
		this.emailAddress = emailAddress;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + ", emailAddress=" + emailAddress + ", gender=" + gender + "]";
	}
	
	public void printPerson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> generateDefaultList(){
		 List<Person> people = new ArrayList<>();
		 
		 people.add(new Person("shobbir",20, "shobir@gmail.com",Sex.Male));
		 people.add(new Person("shonu",23, "shonu@gmail.com",Sex.Female));
		 people.add(new Person("SIvam",28, "sivam@gmail.com",Sex.Male));
		 
		 return people;
	}
	
	

}
