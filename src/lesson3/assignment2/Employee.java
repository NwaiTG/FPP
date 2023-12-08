package lesson3.assignment2;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import lesson3.assignment1.AccountType.AccountTypes;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getHireDate() {
		return this.hireDate;
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountTypes.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountTypes.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountTypes.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		String checkingAccount = "";
		String savingAccount = "";
		String retirementAccount = "";
		
		if(!this.checkingAcct.equals(null))
			checkingAccount = this.checkingAcct.toString();
		
		if(!this.savingsAcct.equals(null))
			savingAccount = this.savingsAcct.toString();
		
		if(this.retirementAcct != null)
			retirementAccount = this.retirementAcct.toString();
		
		
		return "ACCOUNT INFO FOR " + this.name + ":\n\n" + checkingAccount +
				savingAccount + retirementAccount;
		//return null;
	}
	public void deposit(AccountTypes acctType, double amt){
		// implement
		if(acctType == AccountTypes.CHECKING) {
			checkingAcct.makeDeposit(amt);
		}
		else if(acctType == AccountTypes.SAVINGS) {
			savingsAcct.makeDeposit(amt);
		}
		else {
			retirementAcct.makeDeposit(amt);
		}			
	}
	
	public boolean withdraw(AccountTypes acctType, double amt){
		// implement
		if(acctType == AccountTypes.CHECKING) {
			return checkingAcct.makeWithdrawal(amt);
		}
		else if(acctType == AccountTypes.SAVINGS) {
			return savingsAcct.makeWithdrawal(amt);
		}
		else {
			return retirementAcct.makeWithdrawal(amt);
		}
	}

}
