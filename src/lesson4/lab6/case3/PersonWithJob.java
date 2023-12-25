package lesson4.lab6.case3;

import java.util.GregorianCalendar;


public class PersonWithJob{
	private double salary;
	private Person per;
	
	PersonWithJob(String n, GregorianCalendar dob, double s){
		per = new Person(n, dob);
		this.salary = s;
	}
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object withJob) {
		if(withJob == null) return false;
		if(!(withJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)withJob;
		boolean isEqual = per.getName().equals(p.per.getName()) && 
				per.getDateOfBirth().equals(p.per.getDateOfBirth()) &&
				this.salary == p.salary;
				
		return isEqual;
	}
//	public boolean equals(Object withJob) {
//		if(withJob == null) return false;
//		if(withJob.getClass() != getClass()) return false;
//		PersonWithJob p = (PersonWithJob)withJob;
//		boolean isEqual = per.getName().equals(p.per.getName()) && 
//				per.getDateOfBirth().equals(p.per.getDateOfBirth()) &&
//				this.salary == p.salary;
//				
//		return isEqual;
//	}
}
