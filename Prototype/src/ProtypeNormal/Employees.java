package ProtypeNormal;

import java.util.List;
import java.util.ArrayList;

public class Employees implements Cloneable {
	private List<String> employeeList = new ArrayList<String>();
	
	public Employees() {

		
	}
	
	public Employees(List<String> list) {
		this.employeeList = list;
	}
	
	public void loadData() {
		employeeList.add("Kirushan");
		employeeList.add("Shan");
		employeeList.add("Kiru");
		
		}
	
	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		List<String> temp = new ArrayList<String>();
//		for (String s : this.getEmployeeList()) {
//			temp.add(s);
//			
//		}
		
		return employeeList;
	}
	
	
//	https://www.digitalocean.com/community/tutorials/prototype-design-pattern-in-java
//	https://www.youtube.com/watch?v=gpIUfj3KaOc&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3
	
	
	
}
