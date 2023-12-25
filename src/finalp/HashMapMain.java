package finalp;

import java.util.HashMap;

public class HashMapMain {
	static int nonRepeatedInt(int[] arr){
		int nonRepeatNo = 0;
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++){
			hMap.put(arr[i], arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++){
			if(!hMap.containsKey(arr[i])) {
				nonRepeatNo = i;
				return nonRepeatNo; 
			}
		}
		
		return nonRepeatNo;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3, 2, 4, 1, 5};
		System.out.println(nonRepeatedInt(arr));
	}
}
