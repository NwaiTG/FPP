package day2;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAdd;
	private Address shippingAdd;
	
	public Customer(String fName, String lName, String ssn) {
		firstName = fName;
		lastName = lName;
		socSecurityNum = ssn;
	}
	
	public String toString() {
		return "[" + firstName + ", " + lastName + ", ssn: " + socSecurityNum + "]";
	}
	
	public Address getBillingAdd() {
		return billingAdd;
	}
	public void setBillingAdd(Address billAdd) {
		this.billingAdd = billAdd;
	}
	public Address getShippingAdd() {
		return shippingAdd;
	}
	public void setShippingAdd(Address shipAdd) {
		this.shippingAdd = shipAdd;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSSN() {
		return socSecurityNum;
	}

}
