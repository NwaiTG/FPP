package lesson4.lab2.closedcurve.good;

public final class Circle extends ClosedCurve {
	private final double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double computeArea() {
		return (Math.PI * radius * radius);
	}
	@Override
	public String toString() {
		return "The area of this Circle is " + computeArea();
	}
}
