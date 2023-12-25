package lesson10.prob2;

import java.util.Objects;

public class Rational {
	private int numerator;
	private int denominator;
	private Rational rat;

	Rational(int p, int q) {
		if (q <= 0) {
//			System.out.println("Denominator must be positive number");
			throw new IllegalArgumentException("Denominator must be positive number");
		}
		this.numerator = p;
		this.denominator = q;
	}

	public Rational add(Rational rat) {
		int numertor = this.numerator * rat.denominator + rat.numerator * this.denominator;
		int denominator = this.denominator * rat.denominator;
		return new Rational(numertor, denominator);
	}

	public Rational multiply(Rational rat) {
		int mulNumertor = this.numerator * rat.numerator;
		int mulDenominator = this.denominator * rat.denominator;
		return new Rational(mulNumertor, mulDenominator);
	}

	public int compareTo(Rational rat) {
		if (this.equals(rat)) {
			return 0;
		}			
		else if (this.numerator / this.denominator < rat.numerator / rat.denominator) {
			return -1;
		} else {
			return 1;
		}
	}

	public int getNumerator() {
		return this.numerator;
	}

	public void setNumberator(int p) {
		this.numerator = p;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setdenominator(int q) {
		this.denominator = q;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Rational))
			return false;
		Rational rat = (Rational) obj;
		return this.denominator * rat.numerator == this.numerator * rat.denominator;
	}

	public int hashCode() {
		return Objects.hash(this.numerator / this.denominator, rat.numerator / rat.denominator);
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

}
