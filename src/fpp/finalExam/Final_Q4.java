package fpp.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Final_Q4 {
	public static Queue<String> removDup(Map<String, List<String>> userRequest){
		Queue<String> queue = new LinkedList<String>();
		
		/*** return type of entrySet() 
		Set<Map.Entry<String, List<String>>> entry = userRequest.entrySet();
		Iterator<Map.Entry<String, List<String>>> it = entry.iterator(); */
		
		
		/**** value's iterator ****
		List<List<String>> value = new ArrayList<>(userRequest.values());
		Iterator<List<String>> it = value.iterator(); ***/
		
		/**** return type of value
		Collection<List<String>> values = userRequest.values(); ***/
		var value = userRequest.values();
		Iterator<List<String>> it = value.iterator();
		while(it.hasNext()) {
			List<String> songList = it.next();
			for(String song : songList) {
				if(!queue.contains(song)) {
					queue.add(song);
				}
			}			
		}
		return queue;
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		map.put("TT", Arrays.asList("A", "B", "C"));
		map.put("BB", Arrays.asList("A", "B", "D"));
		
		System.out.println(removDup(map));
	}

}
