package lesson4.lab1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	double overtimeHours;
	
	public Secretary(String name, LocalDate hireDate, double salary, double otHours) {
		super(name, hireDate, salary);
		this.overtimeHours = otHours;
	}
	
	public Double getOvertimeHours() {
		return this.overtimeHours;
	}
	
	public void setOvertimeHours(Double otHour) {
		this.overtimeHours = otHour;
	}
	
	@Override
	double computeSalary() {
		return this.salary + (12 * this.overtimeHours);
	}
}
