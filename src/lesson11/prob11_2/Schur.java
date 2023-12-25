package lesson11.prob11_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {
	public boolean checkForSum(List<Integer> list, Integer z) {
		var hMap = new HashMap<Integer, Integer>();
		int val = 0;
		for(int i = 0; i < list.size(); i++) {
			val = list.get(i);
			if(hMap.containsValue(z - val)){
				return true;}
				hMap.put(val, val);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Schur s = new Schur();

		boolean b = s.checkForSum(Arrays.asList(2, 4, 3, 4, 8), 12);
		System.out.println("is Present: " + b);

	}
}
