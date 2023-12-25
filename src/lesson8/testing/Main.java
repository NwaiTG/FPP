package lesson8.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
//		List<String> strLinkedList = new LinkedList<String>();
//		strLinkedList.add("A");
//		strLinkedList.add("B");
//		strLinkedList.add("C");
//		
//		int position = strLinkedList.indexOf("C");
//		int ps = Collections.binarySearch(strLinkedList, "C");
//		
//		System.out.println(position);
//		System.out.println(ps);
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Java");
		queue.offer("DotNet");
		queue.offer("PHP");
		queue.offer("HTML");
		Iterator I = queue.iterator();
		I.next();
		I.next();
		I.remove();
		System.out.println(I.next());

	}
}
