package lesson3.assignment1;

import lesson3.assignment1.AccountType.AccountTypes;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee("Dean", "One One", 10000, 2000, 12, 25);
		
		Account checkingAcc = new Account(emp, AccountTypes.CHECKING, 300);
		Account savingAcc = new Account(emp, AccountTypes.SAVINGS, 300);
		Account retirementAcc = new Account(emp, AccountTypes.RETIREMENT, 300);
		
		System.out.println(checkingAcc.toString());
		System.out.println(savingAcc.toString());
		System.out.println(retirementAcc.toString());
	}	
}
