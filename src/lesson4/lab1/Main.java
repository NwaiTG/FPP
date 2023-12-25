package lesson4.lab1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Professor pro1 = new Professor("Professor1", LocalDate.of(1987, 12, 15), 80000, 10);
		Professor pro2 = new Professor("Professor2", LocalDate.of(1985, 12, 15), 90000, 10);
		Professor pro3 = new Professor("Professor3", LocalDate.of(1984, 12, 15), 100000, 10);
		
		Secretary sec1 = new Secretary("Secret 1", LocalDate.of(1990, 11, 11), 70000, 200);
		Secretary sec2 = new Secretary("Secret 2", LocalDate.of(1992, 11, 11), 60000, 200);
		
		DeptEmployee[] department = {pro1, pro2, pro3, sec1, sec2};
		// Can instantiate
		
		//DeptEmployee depE = new DeptEmployee("test", LocalDate.of(1987, 12, 15), 80000);
		
		System.out.println("Do you want to see the sum of all salaries in the department?");
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		sc.close();
		double sumSalary = 0;
		
		if(ans.equals("Y")) {
			for(DeptEmployee emp : department) {
				System.out.println(emp.toString());
				sumSalary += emp.computeSalary();
			}
			
			System.out.println("\nTotal salary for the department: " + sumSalary);
		}
	}
}
