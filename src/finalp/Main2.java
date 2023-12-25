package finalp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main2{
	public static void main(String[] args){
		List<String> list1 = dataList1();
		List<String> list2 = dataList2();
		List<String> list3 = dataList3();
		
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		
		List<List<String>> colList = new ArrayList<List<String>>();
		colList.add(list1);
		colList.add(list2);
		colList.add(list3);
		
		Collections.sort(colList, new NewComparator());
		
		colList.forEach(list -> System.out.println(list));
		
		System.out.println();
		
		Iterator it = colList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	static class NewComparator implements Comparator<List<String>>{
		@Override
		public int compare(List<String> l1, List<String> l2) {
			return l1.get(0).compareTo(l2.get(0));
		}
	}
	
	private static List<String> dataList1() {
		return new ArrayList<String>() {
			{
				add("Joe"); add("Bill");add("Sue");
				add("Rob"); add("Mohammed");add("Steven");
			}
		};
	}

	private static List<String> dataList2() {
		return new ArrayList<String>() {
			{
				add("Rick"); add("Sally");add("Tom");
				add("George"); 
			}
		};
	}

	private static List<String> dataList3() {
		return new ArrayList<String>() {
			{
				add("Talia"); add("Richard");add("Chloe");
				add("Celine"); add("Zahra");add("Rod");
				add("Frank");
			}
		};
	}
}