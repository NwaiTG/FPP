package day2;

public class Prog2 {

	public static void main(String[] args) {
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		System.out.println("πx: " + Math.pow(Math.PI, x));
		System.out.println("yπ: " + Math.pow(y, Math.PI));
		System.out.println(Math.pow(2, 2));
	}
}
