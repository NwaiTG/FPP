package lesson7.pencil;

import day2.RandomNumbers;

public class Pencil1 {

	public static void main(String[] args) {
		new Pencil1();
	}

	Pencil1() {
		recurse("Hello");
		}

	String recurse(String s) {
		if (s == null)
			return null;
		int r = RandomNumbers.getRandomInt();
		int n = s.length();
		if (r % 2 == 0)
			return recurse(s.substring(0, n / 2));
		else {
			return recurse(s.substring(n / 2, n));
		}
	}

}
