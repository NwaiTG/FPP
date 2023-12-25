package lesson4.exercise2;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return getName() + " " + getSalary();
	}
	
	int addInt() {
		return 1;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Bob", 85000);
		System.out.println(e.toString());
		e.addInt();
	}
}
