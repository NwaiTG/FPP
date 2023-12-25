package lesson10.prob2;

public class Main {
	public static void main(String[] args) {
		Rational r1 = new Rational(2, 3);
		Rational r2 = new Rational(-17, 5);
		Rational r3 = new Rational(1, 3);
		
		Rational firstR = r1.multiply(r2).add(r3);
		Rational secR = r1.multiply(r2.add(r3));
		
		if(firstR.compareTo(secR) == 0) {
			System.out.println(firstR.toString() + " is equal to " + secR.toString());
		}
		else if(firstR.compareTo(secR) < 0) {
			System.out.println(firstR.toString() + " is less than " + secR.toString());
		}
		else {
			System.out.println(firstR.toString() + " is greater than " + secR.toString());
		}
	}
}
