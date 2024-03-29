package lesson4.lab4.closedcurve.good;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	@Override
	public String toString() {
		return "The area of this Square is " + computeArea();
	}
	//@Override
	public int getNumberOfSides() {
		return 4;
	}	
	//@Override
	public double computePerimeter() {
		return 4 * this.side;
	}
}
