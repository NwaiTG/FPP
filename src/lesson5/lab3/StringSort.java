package lesson5.lab3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	Comparator<String> myComparator;

	public StringSort(Comparator<String> myComparator) {
		this.myComparator = myComparator;
	}

	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, myComparator);
		return arr;
	}
}


