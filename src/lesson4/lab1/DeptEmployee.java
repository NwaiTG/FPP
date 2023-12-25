package lesson4.lab1;

import java.time.LocalDate;

public class DeptEmployee {
	String name;
	LocalDate hireDate;
	double salary;
	
	public DeptEmployee(String name, LocalDate date, double salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.hireDate = date;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getHireDate() {
		return this.hireDate;
	}
	
	public void setHireDate(LocalDate date) {
		this.hireDate = date;
	}
	
	double computeSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.hireDate;				
	}
}
