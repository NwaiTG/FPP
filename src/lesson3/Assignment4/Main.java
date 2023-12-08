package lesson3.Assignment4;

public class Main {
	public static void main(String[] args) {
		Circle cr = new Circle(1);
		Triangle tri = new Triangle(1, 2);
		Rectangle rec = new Rectangle(1, 2);
		
		System.out.println("Area of a rectangle = " + rec.computeArea());
		System.out.println("Area of a triangle = " + tri.computeArea());
		System.out.println("Area of a circle = " + cr.computeArea());
	}
}
