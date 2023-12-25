package lesson4.lab3.employeeinfo;

import lesson3.assignment1.AccountType.AccountTypes;

public class RetirementAccount extends Account {
	final static double penaltyPercent = 0.02;
	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public AccountTypes getAcctType() {
		return AccountTypes.RETIREMENT;
	}
	
	@Override
	public double getBalance() {
		double penaltyAmt = penaltyPercent * super.getBalance();
		return super.getBalance() + penaltyAmt;
	}
}
