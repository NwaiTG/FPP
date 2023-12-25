package lesson5.inClass;

import java.util.Arrays;
import java.util.Comparator;

import lesson5.exe1.Person;

public class localInnerClass {
	public static void main(String[] args) {
		localInnerClass pd = new localInnerClass();
		Person[] persons = prepareData();
		pd.sort(persons);
		System.out.println(Arrays.toString(persons));
	}
	
	private void sort(Person[] persons) {
		class NameComparator implements Comparator<Person>{
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		}
		Arrays.sort(persons, new NameComparator());
	}
	
	static Person[] prepareData() {
		Person[] persons = 
			{new Person("Joess"), new Person("Bob"), new Person("Anne")};
		return persons;
	}
}
