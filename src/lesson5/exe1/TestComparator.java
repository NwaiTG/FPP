package lesson5.exe1;

import java.util.Arrays;
import java.util.Comparator;

//import lesson5_innersort1.NameComparator;
//import lesson5_innersort1.Person;

public class TestComparator{
	
	
	public static void main(String[] args) {
		Person[] persons = prepareData();
		TestComparator t = new TestComparator();
		Arrays.sort(persons, t.getNameComparator());
		System.out.println(Arrays.toString(persons));
	}
	
	static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joe"), new Person("Bob"), new Person("Anne")};
		return persons;
	}
	
	private NameComparator getNameComparator() {
		return new NameComparator();
	}
}
