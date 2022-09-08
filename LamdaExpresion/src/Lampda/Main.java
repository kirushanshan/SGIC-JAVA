package Lampda;

import java.util.List;

interface CheckPerson {
	boolean test(Person p);
}


class CheckEligiblePerson implements CheckPerson {

	@Override
	public boolean test(Person p) {
		// TODO Auto-generated method stub
		return p.gender == Person.Sex.Female && 
				p.getAge() >= 18 && 
				p.getAge() <= 28;
	}
	
}

public class Main {
	
	public static void printPersonOlderThan(List<Person> people, int age) {
		
		for(Person p : people) {
			if(p.getAge() >= age ) {
				p.printPerson();
			}
		}
	}
	
	
	public static void printPersonWithinAgeLimit(List<Person> people, int lowAge, int maxAge) {
		for(Person p : people) {
			if(lowAge <= p.getAge() && p.getAge() < maxAge) {
				p.printPerson();
			}
		}
	}
	
	public static void printPeople(List<Person> people, CheckPerson tester ) {
		
		for(Person p : people) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void main(String[] args) {
		List<Person> people = Person.generateDefaultList();
		
//		printPersonOlderThan(people, 22);
//		printPeople(people, new CheckEligiblePerson() );
		
		printPeople(people, new CheckPerson() {

			@Override
			public boolean test(Person p) {
				return p.gender == Person.Sex.Female && 
						p.getAge() >= 18 && 
						p.getAge() <= 28;
			}
			
		});
		
		System.out.println("______________");
		
		printPeople(people, p -> p.gender == Person.Sex.Male && p.getAge() >= 18 && p.getAge() <= 28);

	}

}
