package finalp;

public class recu_arrangeString {
	public String sort(String s){
		String res = "";
		if(s == null || s.length() < 1) return res;
		int pos = minpos(s);
		res = res + s.charAt(pos);
//		s = s.substring(0, pos) + s.substring(pos + 1, s.length());
		s = s.substring(0, pos) + s.substring(pos + 1);
		return res + sort(s);
	}

	public int minpos(String s){
		char c = s.charAt(0);
		int pos = 0;
		int p = 'a' - 'd';
		for(int i = 0; i < s.length() - 1; i++){
			if(c > s.charAt(i)){
				c = s.charAt(i);
				pos = i;
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		recu_arrangeString rec = new recu_arrangeString();
		String res = rec.sort("zwxuabfkafutbbbb");
		System.out.println(res);
	}
}
