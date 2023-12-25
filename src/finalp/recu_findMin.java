package finalp;

import java.util.ArrayList;
import java.util.List;

public class recu_findMin {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(8);
		arr.add(1);
		arr.add(4);
		arr.add(10);
		arr.add(20);
		System.out.print(findMin(arr));
	}
	static Integer findMin(List<Integer> arr){
		if(arr == null || arr.isEmpty())	return null;
		return recurFindMin(arr);
	}

	static int recurFindMin(List<Integer> arr){
		Integer first = arr.remove(0);
		if(arr.isEmpty()) return first;
		Integer recFind = recurFindMin(arr);
		return recFind.compareTo(first) < 0 ? recFind : first;
	}

}
