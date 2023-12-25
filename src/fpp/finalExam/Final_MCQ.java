package fpp.finalExam;
import java.util.Map;
import java.util.HashMap;

public class Final_MCQ {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", null);
		map.put("B", null);
		map.put("C", null);
		map.put("A", null);
		map.put("A", "Banana");
		map.put("A", "Orange"); // Overwrite
		System.out.println(map);
	}	
}
