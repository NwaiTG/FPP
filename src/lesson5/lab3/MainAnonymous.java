package lesson5.lab3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous{
	public static void main(String[] args) {
		final boolean ascending = false;
		StringSort ss = new StringSort(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return ascending ? (o1.length() - o2.length()) : 
					(o2.length() - o1.length());
			}
		});
		
		String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
		ss.stringSort(testStrings);

		System.out.println(Arrays.asList(testStrings));
		
	}
}
