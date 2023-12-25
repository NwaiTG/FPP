package lesson4.lab5.closedcurve.good;

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
	@Override
	public double[] getArrayOfSides() {
		double[] res = {this.side, this.side, this.side, this.side};
		return res;
	}
}
