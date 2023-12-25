package lesson4.lab2.closedcurve.good;

public class Rectangle extends ClosedCurve {
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	double computeArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "The area of this Rectangle is " + computeArea();
	}
}
