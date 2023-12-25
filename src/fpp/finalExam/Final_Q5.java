package fpp.finalExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Final_Q5 {
	public static List<Integer> mergeAndSort(List<Integer> list1, List<Integer> list2){
		List<Integer> res = new ArrayList<>();
		list1.addAll(list2);
		Collections.sort(list1);
		
//		for(int i = 0; i < list1.size(); i++) {
//			int min = list1.get(i);
//			for(int j = i; j < list1.size(); j++) {
//				if(min > list1.get(j)) {
//					min = list1.get(j);
//				}
//			}
//			res.add(min);
//		}
		return list1;
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 6));
		List<Integer> list2 = new ArrayList<>(List.of(2, 4, 7, 8));
		System.out.println(mergeAndSort(list1, list2));
	}
}
