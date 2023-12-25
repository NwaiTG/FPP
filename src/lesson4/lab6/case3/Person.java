package lesson4.lab6.case3;

import java.util.GregorianCalendar;

public class Person implements Cloneable {
	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob){
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	
	public final boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name) && this.dateOfBirth.equals(p.dateOfBirth);
		return isEqual;
	}
//	public final boolean equals(Object aPerson) {
//		if(aPerson == null) return false;
//		if(aPerson.getClass() != getClass()) return false;
//		Person p = (Person)aPerson;
//		boolean isEqual = this.name.equals(p.name) && this.dateOfBirth.equals(p.dateOfBirth);
//		return isEqual;
//	}
//	@Override
//	public Object clone() throws CloneNotSupportedException{
//		Person copy = (Person)super.clone();
//		return copy;
//	}
	public static void main(String[] args) {
		GregorianCalendar dob = new GregorianCalendar(2000, 13, 12);
		Person person1 = new Person("Person1", dob);
		Person person2 = new Person("Person1",dob);
		PersonWithJob personWJ1 = new PersonWithJob("Person1", dob, 2000);
		PersonWithJob personWJ2 = new PersonWithJob("Person1", dob, 1000);
		System.out.println(person1.equals(person2));
		System.out.println(personWJ1.equals(personWJ2));
	}
}
