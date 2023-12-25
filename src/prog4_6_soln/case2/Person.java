package prog4_6_soln.case2;

import java.util.GregorianCalendar;

import prog4_6_soln.case2.PersonWithJob;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(getClass() != ob.getClass()) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	//For the 7/2013 exam hashCode does not need to be implemented
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar dob = new GregorianCalendar(2000, 13, 12);
		Person person1 = new Person("Person1", dob);
		Person person2 = new Person("Person1",dob);
		PersonWithJob personWJ1 = new PersonWithJob("Person1", dob, 2000);
		PersonWithJob personWJ2 = new PersonWithJob("Person1", dob, 1000);
		System.out.println(person1.equals(person2));
		System.out.println(personWJ1.equals(personWJ2));

	}

}
