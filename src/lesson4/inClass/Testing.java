package lesson4.inClass;

class Testing {
	protected int x = 1;
	
	public String test() {return "From Testing";}
	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.x);
	}
}
