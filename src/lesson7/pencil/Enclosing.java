package lesson7.pencil;

public class Enclosing implements Cloneable {
	public Enclosing clone() throws CloneNotSupportedException {
		System.out.println("Inside Enclosing.clone()");
		return (Enclosing)super.clone();
	}
	class Inner extends Enclosing{
		void innerMethod() throws CloneNotSupportedException {
			Object copy = clone();
			System.out.println(copy.getClass().getName());
			
		}
	}
	public static void main(String[] args){
		Enclosing p1 = new Enclosing();
		Enclosing.Inner i1 = p1.new Inner();
		try {
			i1.innerMethod();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}
