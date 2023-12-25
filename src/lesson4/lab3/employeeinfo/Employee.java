package lesson4.lab3.employeeinfo;

import lesson4.lab3.*;
import java.time.LocalDate;

import lesson3.assignment1.AccountType.AccountTypes;

public class Employee {

	/*private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;*/
	public AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.accounts = new AccountList();
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalDate getHireDate() {
		return this.hireDate;
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		Account acct = new CheckingAccount(this, startAmount);
		accounts.add(acct);
	}

	public void createNewSavings(double startAmount) {
		// implement
		Account acct = new SavigsAccount(this, startAmount);
		accounts.add(acct); 
	}

	public void createNewRetirement(double startAmount) {
		// implement
		Account acct = new RetirementAccount(this, startAmount);
		accounts.add(acct); 
	}

	public String getFormattedAcctInfo() {
		// implement
		String acctName = "ACCOUNT INFO FOR " + this.name + ":\n\n";
		String acctInfo = "";
		
		for(int i = 0; i < accounts.size(); i++)
		{
			acctInfo = acctInfo + accounts.get(i).toString();
		}
		
		return acctInfo = acctName + " " + acctInfo;
			
		
		/*if(!this.checkingAcct.equals(null))
			checkingAccount = this.checkingAcct.toString();
		
		if(!this.savingsAcct.equals(null))
			savingAccount = this.savingsAcct.toString();
		
		if(this.retirementAcct != null)
			retirementAccount = this.retirementAcct.toString();
		
		
		return "ACCOUNT INFO FOR " + this.name + ":\n\n" + checkingAccount +
				savingAccount + retirementAccount;
		//return null;*/
	}
	
	public void deposit(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}
	
	public boolean withdraw(int accountIndex, double amt){
		// implement
		Account selected = accounts.get(accountIndex);
		return selected.makeWithdrawal(amt);
	}
	
	public MyStringList getNamesOfAccounts() {
		MyStringList strList = new MyStringList();
		for(int i = 0; i < this.accounts.size(); i++) {
			AccountTypes acctType = this.accounts.get(i).getAcctType();
			strList.add(acctType.toString());
		}
		return strList;
	} 

}
