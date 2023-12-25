package lesson5.exe2;

public class Outer {
	private int data = 10;
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.printValue(20);
	}
	
	void printValue(int bound) {
		if(data < bound) {
			class Inner{
				public int getValue() {
					return data;
				}
			}
			Inner inner = new Inner();
			System.out.println("Inside inner: " + inner.getValue());
		}
		else {
			System.out.println("Inside outer: " + (data - bound));
		}
			
	}
}
