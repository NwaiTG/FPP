package Lesson2.assignment5;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inpurt something: ");
		String input = sc.nextLine();

		int index = input.length();
		
		String result = "";
		for(int i = 0; i < input.length(); i++) {
			result = result + input.substring(index - 1, index);
			index--;
		}
		
		System.out.println(result);
	}
}
