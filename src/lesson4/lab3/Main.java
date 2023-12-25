package lesson4.lab3;

import java.util.Scanner;

import lesson4.lab3.employeeinfo.*;

public class Main {
	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		// emps[1].createNewRetirement(27000); //ntg
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C): ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("A")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		} else { 
			int i = 0;
			// Display employee name
			for (Employee e : emps) {
				System.out.println(i + ". " + e.getName()); i++;
			}
			System.out.println("Select an employee: (type a number): ");
			i = sc.nextInt();

			if (i < emps.length) {
				MyStringList acctTypes = emps[i].getNamesOfAccounts();
				// Display account type
				for (int j = 0; j < acctTypes.size(); j++) {
					System.out.println(j + ". " + acctTypes.get(j));
				}

				System.out.println("Select an account: (type a number): ");
				int acctType = sc.nextInt();
				double amount = 0;

				if (answer.equalsIgnoreCase("B")) {
					System.out.println("Deposit amount: ");
					amount = sc.nextDouble();
					sc.close();
					calculateBalance(emps[i], amount, true, acctType);
				} else {
					System.out.println("Withdrawal amount: ");
					amount = sc.nextDouble();
					sc.close();
					calculateBalance(emps[i], amount, false, acctType);
				}
			}
		}

	}

	void calculateBalance(Employee e, double amount, Boolean isDeposit, int accountIndex) {
		if (isDeposit) {
			e.deposit(accountIndex, amount);
			System.out.println("$" + amount + " has been deposited in the " + e.getNamesOfAccounts().get(accountIndex) + " of the " + e.getName() + ".");
			System.out.println("After deposited bal: " + e.accounts.get(accountIndex).getBalance());
		}
		else {
			e.withdraw(accountIndex, amount);
			System.out.println("$" + amount + "has been withdrawal in the " + e.getNamesOfAccounts().get(accountIndex) + "of the " + e.getName());
			System.out.println("After withdrawal bal: " + e.accounts.get(accountIndex).getBalance());
		}
	}

	String getFormattedAccountInfo() {
		// loop through employees array and get formatted
		// account info for each employee, and assemble into a string
		StringBuilder result = new StringBuilder();

		for (Employee emp : emps) {
			result.append(emp.getFormattedAcctInfo());
			result.append("\n");
		}

		return result.toString();
	}
}
