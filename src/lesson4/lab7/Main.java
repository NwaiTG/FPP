package lesson4.lab7;

import java.util.Arrays;

import lesson4.lab7.employeeinfo.Employee;

public class Main {

	Employee[] emps;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

//		Employee e = null;
//		for (int i = 0; i < emps.length-1; i++) {
//			if (emps[i].compareTo(emps[i+1]) == 1) {
//				e = emps[i];
//				emps[i] = emps[i+1];
//				emps[i+1] = e;
//			}
//		}
//		using Comparable implementation on Employee
		// to sort emps
		Arrays.sort(emps); 
		System.out.println(Arrays.toString(emps));		
	}

}
