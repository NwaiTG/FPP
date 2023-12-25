package lesson4.lab3.employeeinfo;

import lesson3.assignment1.AccountType.AccountTypes;

public class CheckingAccount extends Account{
	final static int monthlyServiceCharge = 5;
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public AccountTypes getAcctType() {
		return AccountTypes.CHECKING;
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() - monthlyServiceCharge;
	}
}
