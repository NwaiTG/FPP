package lesson4.lab3.employeeinfo;

import lesson3.assignment1.AccountType.AccountTypes;

public abstract class Account {
	/*public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";*/	
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	//private AccountTypes acctType;
	private Employee employee;

	Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}

	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + this.getAcctType() + "\nCurrent bal: " + this.balance + "\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		//this.balance += deposit;
		this.balance = this.getBalance();
		this.balance = this.balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		this.balance = this.getBalance();
		if(this.balance < amount) {
			return false;
		}
		else{
			this.balance = this.balance - amount;
			return true;
		}		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*public void setAcctType(AccountTypes acctType) {
		this.acctType = acctType;
	}*/
	
	abstract AccountTypes getAcctType();
}
