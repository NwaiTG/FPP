package finalp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> qs = new LinkedList<>();
		qs.add("John");
		qs.add("Dave");
		qs.add("Bob");
		qs.poll();
		qs.offer("Dave");
		qs.remove();
		System.out.println(qs);
	}
	
}
