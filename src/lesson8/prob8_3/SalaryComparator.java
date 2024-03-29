package lesson8.prob8_3;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		int salary1 = e1.getSalary();
		int salary2 = e2.getSalary();
		//now name1 equals name2 and hireDate1 equals hireDate2
        if(salary1 < salary2) {
			return -1;
		}
		else if(salary1 > salary2) {
			return 1;
		}
		else {
			return 0;
		}
	}	
}
