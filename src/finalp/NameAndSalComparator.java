package finalp;

import java.util.Comparator;

public class NameAndSalComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2){
		String name1 = e1.getName();
		String name2 = e2.getName();
		int sal1 = e1.getSalary();
		int sal2 = e2.getSalary();
		if(name1.compareTo(name2) != 0){
			return name1.compareTo(name2);
		}
		
		if(sal1 == sal2) return 0;
		else if(sal1 > sal2) return 1;
		else return -1;
	}
}
