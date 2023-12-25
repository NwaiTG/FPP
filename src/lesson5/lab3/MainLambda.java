package lesson5.lab3;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args) {
		boolean ascending = false;
		
		StringSort stringsort = new StringSort((o1, o2) -> 
		ascending ? (o1.length() - o2.length()) : 
			(o2.length() - o1.length()));
		
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		stringsort.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
		
	}
}
