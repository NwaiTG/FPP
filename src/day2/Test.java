package day2;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] arr = {"Steve", "Joe", "Alice", "Tom"};
		String[] newArr = Arrays.copyOf(arr, 3);
		Arrays.sort(newArr);
		System.out.println(Arrays.toString(newArr));
		
		
		//		String t = "Hello, strings can be fun. They have many uses.";
//		String[] res = t.split(",");
		
				
//		System.out.printf("You owe me $%f \n", 195.50f);
//		System.out.printf("You owe me $%.2f \n", 195.50f); //.2 is precision specifier
//		System.out.printf("You owe me $%7.2f \n", 195.50f); //7 is width specifier
//		String date = String.format("Today's date: %tD", new Date());
//		System.out.println(date);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Type your name:");
//		String s = sc.nextLine();
//		System.out.println(s.injxJdexOf('e') + 1);
//		
//		System.out.println("Type your name again:");
//		String n = sc.nextLine();
//		sc.close();
//		int count =0;
//		for(int i = 0; i < n.length(); i++) {
//			if(n.charAt(i) == 'e')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}