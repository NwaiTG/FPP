package day2;

public class Prog6 {
	public static String[] removeDups(String[] ar_Orginal) {
		
		String[] ar_Temp = new String[ar_Orginal.length];
		ar_Temp[0] = ar_Orginal[0].toString();
		int index = 1; int count = 0;
		
		for(int i = 0; i < ar_Orginal.length; i++){
			Boolean isHas = false; 
			
			for(int j = 0; j < ar_Temp.length; j++) {
				if(ar_Orginal[i] == ar_Temp[j]){
					isHas = true;
				}
			}	
			
			if(!isHas){
				ar_Temp[index] = ar_Orginal[i];
				index++;
			}
		}
		
		for (int i = 0; i < ar_Temp.length; i++){
				if(ar_Temp[i] != null) {
					count++;
				}
		}
		
		String[] ar_NoDup = new String[count];
		int k = 0;
		
		for (int i = 0; i < ar_Temp.length; i++){
			if(ar_Temp[i] != null) {
				ar_NoDup[k] = ar_Temp[i];
				k++;
			}
		}
		
		return ar_NoDup;
		
	}
}
