package lesson4.lab5.closedcurve.good;

@FunctionalInterface
public interface Polygon {
	public double[] getArrayOfSides();
	
	public static double sum(double[] arr) {
		double res = 0;
		for(int i = 0; i < arr.length; i++) {
			res += arr[i];
		}
		return res;
	}
	
	public default double computePerimeter() {
		return sum(getArrayOfSides());
	};

}
