package prob4_6.solhw.case3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	Person per;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		per = new Person(name, dob);
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(this.getClass() != ob.getClass()) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return per.getName().equals(p.per.getName()) && per.getDateOfBirth().equals(p.per.getDateOfBirth()) && salary == p.salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
