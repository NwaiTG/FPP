package finalp;

public class recu_StringReverse {
	static String reverse(String str){
		if(str == null || str == "") return "";
		String val = "" + str.charAt(0);
		int index = str.indexOf(val);
//		return reverse(str.substring(1, str.length())) + val;
		return reverse(str.substring(1)) + val;
	}

	public static void main(String[] args){
		System.out.println(reverse("Hello"));
	}
}
