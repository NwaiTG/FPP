package lesson3.premitive;

public class Example {
	public static void main(String[] args) {
		int number = 1;
		
		call(number);
		
		System.out.println("After call: " + number);
	
	}
	
	public static void call(int num) {
		System.out.println("Call num1: " + num);
		
		num = num + 1;
		System.out.println("Call num after adding 1: " + num);
	}
}
