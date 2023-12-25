package lesson4.lab3;

import lesson4.lab3.employeeinfo.*;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] acctArray; 
	private int size;
	
	public AccountList() {
		acctArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account acct){
		//implement		
		if(size == this.acctArray.length) {			
			resize();
			this.acctArray[this.acctArray.length - 2] = acct;
		}
		else {
			this.acctArray[this.size] = acct;
		}
		
		this.size++;		
	}
	
	public Account get(int i){
		//implement
		return this.acctArray[i];
	}
	
	public boolean find(Account acct){
		//implemement
		for(int i = 0; i < this.acctArray.length - 1; i++) {
			if(this.acctArray[i] == acct) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		//implement
		
	}
	
	public boolean remove(Account acct){
		//implement
		for(int i = 0; i < this.acctArray.length - 1; i++) {
			if(this.acctArray[i] == acct) {
				System.arraycopy(this.acctArray, i + 1, this.acctArray, i, size - (i + 1));
				this.size--;
				return true;
			}
		}
		return false;
	}
	
	private void resize(){
		//implement
		Account[] newStr = new Account[this.acctArray.length + INITIAL_LENGTH];
		System.arraycopy(this.acctArray, 0, newStr, 0, this.acctArray.length);
		this.acctArray = newStr;
		//System.out.println("Resizing...........");		
	}
	
	public String toString(){
		//implement
		String result = "[ ";
		
		for(int i = 0; i < this.size - 1; i++) {
			result = result + this.acctArray[i].toString() + ", ";
		}
		
		return result + this.acctArray[this.size - 1] + " ]";
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args){
		/*MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		l.remove("Mark");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		/*l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);*/
		/*AccountList l = new AccountList();
		Employee e1 = new Employee("Dean", 1987, 12, 12);
		Account a1 = new Account(e1);
		l.add(a1);
		System.out.println("The list of size " + l.size() + " is " + l.toString());*/
		//l.add(AccountTypes.SAVINGS);
		//System.out.println("The list of size " + l.size() + " is " + l.toString());
		//l.add(AccountTypes.RETIREMENT);
		/*System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());*/
	}

}
