package day2;

public class Prog4 {
	
	public static void main(String[] args) {
		String myString = Data.records;
		
		String[] product = myString.split(":");		
		
		for(String pro : product){
			System.out.println(pro.substring(0, 4));
		}
	
	}
}
