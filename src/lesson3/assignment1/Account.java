package lesson3.assignment1;

import lesson3.assignment1.AccountType.AccountTypes;

class Account {
	/*public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";*/	
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountTypes acctType;
	private Employee employee;

	Account(Employee emp, AccountTypes acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountTypes acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
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

	public AccountTypes getAcctType() {
		return acctType;
	}

	public void setAcctType(AccountTypes acctType) {
		this.acctType = acctType;
	}
}
