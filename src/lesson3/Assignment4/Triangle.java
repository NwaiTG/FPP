package lesson3.Assignment4;

public final class Triangle {
	private final double base;
	private final double height;
	private final double sides; 
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		sides = 2;
	}
	
	public Triangle(double base, double height, double sides) {
		this.base = base;
		this.height = height;
		this.sides = sides;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	public double getSide() {
		return sides;
	}

	public double computeArea() {	
		double res = 0.5 * this.base * this.height;
		return res;
	}
}
