package finalp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrListRemoveDup {

	public static void main(String [] args){
		 	 	ArrayList<String> a1= new ArrayList<String>();
		 	 	a1.add("a");
		 	 	a1.add("b");
		 	 	a1.add("a");
		 	 	a1.add("java");
		 	 	a1.add("10.3");
		 	 	a1.add("c");
		 	 	a1.add("14");
		 	 	a1.add("java");
		 	 	a1.add("12");
	System.out.println("Before Remove Duplicate elements:" +a1);
	
	/*** Way 3 ***/
	HashSet<String> hSet = new HashSet<String>(a1);
	a1.clear();
	a1.addAll(hSet);
	System.out.println("After Remove Duplicate elements:" + a1);
	
	/* *** Way 1 *** 
	HashMap<String, String> hMap = new HashMap<String, String>();
	
	for(Object obj : a1) {
		if(!hMap.containsKey(obj.toString())){
			hMap.put(obj.toString(), obj.toString());
		}
	}
	
	ArrayList<String> a2 = new ArrayList<> (hMap.values()); */
	
	/* *** Way 2 *** */
//	for(int i = 0; i < a1.size(); i++) {
//		for(int j = a1.size()-1; j > i; j--) {
//			if(a1.get(i).equals(a1.get(j))) {
//				a1.remove(a1.get(j));
//			}
//		}
//	}
	
	
//	for(int i=0; i<a1.size() ; i++){
//	 for(int j = a1.size() -1; j>i; j--){
//		
//
//	 	 if(a1.get(i).equals(a1.get(j))){
//	 	 	 a1.remove(a1.get(j));
//	 	 }
//	 }
//}
//	System.out.println("After Remove Duplicate elements:" +a2);
	
	}
}
