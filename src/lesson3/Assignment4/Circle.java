package lesson3.Assignment4;

public final class Circle {
	private final double radius;
	
	public double getRadius() {
		return radius;
	}	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {		
		return Math.PI * this.radius * this.radius;
	}
}
