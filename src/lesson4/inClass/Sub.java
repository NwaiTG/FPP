package lesson4.inClass;

public class Sub extends Testing{
	int x = 2;
	
	public static void main(String[] args)
	{
		Testing s = new Sub();
		int z = s.x;
		System.out.println(z);
		
	}
}
