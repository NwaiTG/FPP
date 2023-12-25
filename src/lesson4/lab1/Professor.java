package lesson4.lab1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	int numberOfPublications;
	
	public Professor(String name, LocalDate date, double salary, int numPub) {
		super(name, date, salary);
		this.numberOfPublications = numPub;
	}
	
	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}
	
	public void setNumberOfPublications(int n) {
		this.numberOfPublications = n;
	}

}
