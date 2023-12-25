package lesson4.lab4.closedcurve.good;

public class Rectangle extends ClosedCurve implements Polygon {
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
	//@Override
	public int getNumberOfSides() {
		return 4;
	}	
	//@Override
	public double computePerimeter() {
		return (2 * this.length) + (2 * this.width);
	}	
}
