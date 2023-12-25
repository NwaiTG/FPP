package lesson5.eg11;

public class MyOuterClass {
	MyInnerClass inner;
	private String param;
	MyOuterClass(String param){
		inner = new MyInnerClass("innerStr");
		this.param = param;
	}
	
	void outerMethod() {
		System.out.println("1. " + inner.innerParam);
		inner.innerMethod();
	}
	class MyInnerClass{
		private String innerParam;
		MyInnerClass(String innerParam){
			this.innerParam = innerParam;
		}
		void innerMethod() {
			System.out.println("2. " + MyOuterClass.this.param);
			System.out.println("3. " + param);
			
		}
	}
	public static void main(String[] args) {
		(new MyOuterClass("outerStr")).outerMethod();
	}

}
