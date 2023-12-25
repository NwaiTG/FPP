package lesson4.lab5.closedcurve.good;

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
	public double[] getArrayOfSides() {
		double[] res = {2 * this.width, 2 * this.length};
		return res;
	}	
}
