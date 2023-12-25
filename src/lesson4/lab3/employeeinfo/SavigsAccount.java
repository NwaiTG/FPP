package lesson4.lab3.employeeinfo;

import lesson3.assignment1.AccountType.AccountTypes;

public class SavigsAccount extends Account{
	final static double interestRate = 0.25;
	public SavigsAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public AccountTypes getAcctType() {
		return AccountTypes.SAVINGS;
	}
	
	@Override
	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (interestRate/100) * baseBalance;
		return baseBalance + interest;
	}
}
