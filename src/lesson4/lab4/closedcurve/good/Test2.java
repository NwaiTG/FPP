package lesson4.lab4.closedcurve.good;

public class Test2 {
	public static void main(String[] args) {
		Polygon[] objects = {
				new Square(3),
				new Triangle(4,5,6),
				new Rectangle(3, 4)};		
				
		//compute areas
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName());
			System.out.println("\tNumber of sides = " + cc.getNumberOfSides());
			System.out.println("\tPerimeter = " + cc.computePerimeter());
		}
	}
}
