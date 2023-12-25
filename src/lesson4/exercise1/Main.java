package lesson4.exercise1;

class Student{
}

class Undergraduate extends Student{}

class Graduate extends Student{}

class Employee{	
}

public class Main {
	public static void main(String[] agrs) {
	Student std1, std2, std3;
	Graduate std4;
	std1 = new Student();
	std2 = new Undergraduate();
	std3 = new Graduate();
//	std4 = new Student(); //*** Get compile error
	std4 = new Graduate();
	}
}
