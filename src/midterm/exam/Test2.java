package midterm.exam;

class Test2{
	String name;
	int id;
	
	public Test2(String n, int i) {
		this.name = n;
		this.id = i;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public static void main(String[] args) {
//		Test2 s1 = new Test2("s1", 111);
//		Test2 s2 = new Test2("s1", 112);
//		Test2 s3 = s1;
//		s3.setId(113);
//		
//		System.out.println(s1.getId());
//		System.out.println(s2.getId());
//		System.out.println(s3.getId());
		
		int[] arr = { 1, 2, 3 };
		int[] arrCopy = arr;
		arrCopy[0] = 5;
//		System.out.println(arr[0]);
		String s = "nwaithingyan@gmail.com";
		System.out.println(s.charAt(s.length()-1) + s.substring(6,7));
				
	}
}
