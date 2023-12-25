package lesson11.prob11_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap salaryRecord;

	Employee() {
		this.salaryRecord = new HashMap<String, Double>();
	}

	public void addEntry(String date, double salary) {
		// implement
		// salaryRecord = new HashMap<String, Double>();
		salaryRecord.put(date, salary);
	};

	public void printPaymentAmount(String date) {
		// implement
		double sal = 0;
		if (salaryRecord.get(date) != null) {
			sal = (double) salaryRecord.get(date);
		}

		if (sal > 0.00) {
			System.out.println(firstName + " " + lastName + "was paid " + sal + " on " + date);
		} else {
			System.out.println(firstName + " " + lastName + "did not receive a paycheck on " + date);
		}
	}

	public void printAveragePaycheck() {
		// implement
		double totalAmt = 0;
		int count = 0;
		
		// 
		Iterator<Map.Entry<String, Double>> it = salaryRecord.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Double> keyValue = it.next();
			totalAmt += keyValue.getValue();
			count++;
		}
		
//		var payAmtIT = collPayAmt.iterator();
		
//		while (payAmtIT.hasNext()) {
//			totalAmt += (double) payAmtIT.next();
//			count++;
//		}
		System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + totalAmt / count);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
