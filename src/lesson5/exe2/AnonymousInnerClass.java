package lesson5.exe2;

public class AnonymousInnerClass {
	private int data = 10;
	public static void main(String[] args) {
		AnonymousInnerClass outer = new AnonymousInnerClass();
		outer.printValue(20);
	}
	
	void printValue(int bound) {
		if(data < bound) {
//			class Inner{
//				public int getValue() {
//					return data;
//				}
//			}
			Inner inner = new Inner() { // For anonymous need super class or interface
				public int getValue() {
					return data;
				}
			};
			System.out.println("Inside inner: " + inner.getValue());
		}
		else {
			System.out.println("Inside outer: " + (data - bound));
		}
			
	}
}

