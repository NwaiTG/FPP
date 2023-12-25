package midterm.test;

interface Inter {}
class One{}
class Two extends OneOne{}
class Three extends OneOne{}
class Four extends Two implements Inter{}
class Five extends Four{}

class Inner {
	private int i = 0;
	
	class TestInner{
		public int j = 1;
		void sayHi() {
			System.out.println(i);
		}
	}
//	public static void main(String[] args) {
//		TestInner inner = new Inner().new TestInner();
//		inner.sayHi();
////		Inter it = new Four();
////		Four fr = new Five();
////		Two tw = new Four();	
//		//Three tr = new Two();
//		
//	}
}
