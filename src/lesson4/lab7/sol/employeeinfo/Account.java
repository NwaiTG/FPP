package lesson4.lab7.sol.employeeinfo;

abstract public class Account implements Comparable<Account> {
	private Employee emp;
	private double balance;

	@Override
	public int compareTo(Account a) {
		if(balance > a.balance) return 1;
		else if(balance < a.balance) return -1;
		else return 0;
	}
	
	//when dealing with doubles, you cannot rely on the
	//usual == and < relations 
	//this is a better implementation of compareTo
	public int compareTo2(Account a) {
		double error = 0.00001;
		if(Math.abs(balance - a.balance) < error) {
			return 0;
		} 
		// > is reliable now because balance and a.balance are far apart
		else if(balance > a.balance) return 1; 
		else return -1;
	}
	
	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance;
		
		
	}
	Account(Employee e) {
		this(e,0.0);
	}
	abstract public AccountType getAcctType();

	void makeDeposit(double amount){
		balance += amount;
	}
	boolean makeWithdrawal(double amount){
		if(amount > balance){
			return false;
		}
		balance -= amount;
		return true;
	}
	double getBalance(){
		return balance;
	}
	/** used by subclasses only */
	void setBalance(double bal){
		balance = bal;
	}
	void updateBalance() {
		//by default do nothing
	}
	
	
	public Employee getEmp(){
		return emp;
	}
	private String newline = System.getProperty("line.separator");
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
	
}
