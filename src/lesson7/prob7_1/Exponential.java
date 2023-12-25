package lesson7.prob7_1;

public class Exponential {
	double power(double x, int n) {
		if(n == 0 || n == 1)
			return x;
		else {
			return x * power(x, n - 1);
		}
	}

	public static void main(String[] args) {
		Exponential ex = new Exponential();
		System.out.println(ex.power(2, 10));
	}
}
