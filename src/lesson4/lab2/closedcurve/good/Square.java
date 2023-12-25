package lesson4.lab2.closedcurve.good;

public final class Square extends ClosedCurve {
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

}
