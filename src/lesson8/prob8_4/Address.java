package lesson8.prob8_4;

import java.util.*;

public class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	public Address(String name, String street, String city, String state, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getName() {
		return name;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@SuppressWarnings("serial")
	public List<String> asList() {
//		List<String> l = new ArrayList<String>();
//		l.add(name);
//		l.add(street);
//		l.add(city);
//		l.add(state);
//		l.add(zip);
//		return l;
		return new ArrayList<String>() {
			{
				add(name);
				add(street);
				add(city);
				add(state);
				add(zip);
			}
		};		
	}
	/** Converts address fields to upper case, returns as list */
	//implement
	public List<String> toUpper() {
		List<String> var = asList();
		List<String> newArrL = new ArrayList<String>();
		var.forEach(v -> newArrL.add(v.toUpperCase()));
		return newArrL;
	}
	
}
