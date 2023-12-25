package day2;

public class Prog3 {
	public static void main(String[] args) {
		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		
		int sum1 = (int)(a + b + c);
		int sum2 = Math.round(a + b + c);
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
