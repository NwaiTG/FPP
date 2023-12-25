package lesson4.lab6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person{
	private double salary;
	PersonWithJob(String n, GregorianCalendar dob, double s){
		super(n, dob);
		this.salary = s;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object withJob) {
		if(withJob == null) return false;
		if(this.getClass() != withJob.getClass()) return false;
		PersonWithJob p = (PersonWithJob)withJob;
		boolean isEqual = this.getName().equals(p.getName()) && 
				this.getDateOfBirth().equals(p.getDateOfBirth()) &&
				this.salary == p.salary;
				
		return isEqual;
	}
}
