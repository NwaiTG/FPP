package lesson3.assignment3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		//implement		
		if(size == this.strArray.length) {			
			resize();
			this.strArray[this.strArray.length - 2] = s;
		}
		else {
			this.strArray[this.size] = s;
		}
		
		this.size++;		
	}
	
	public String get(int i){
		//implement
		return this.strArray[i].toString();
	}
	
	public boolean find(String s){
		//implemement
		for(int i = 0; i < this.strArray.length - 1; i++) {
			if(this.strArray[i] == s) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(String s, int pos){
		//implement
		
	}
	
	public boolean remove(String s){
		//implement
		for(int i = 0; i < this.strArray.length - 1; i++) {
			if(this.strArray[i] == s) {
				System.arraycopy(this.strArray, i + 1, this.strArray, i, size - (i + 1));
				this.size--;
				return true;
			}
		}
		return false;
	}
	
	private void resize(){
		//implement
		String[] newStr = new String[this.strArray.length + INITIAL_LENGTH];
		System.arraycopy(this.strArray, 0, newStr, 0, this.strArray.length);
		this.strArray = newStr;
		System.out.println("Resizing...........");		
	}
	
	public String toString(){
		//implement
		String result = "[ ";
		
		for(int i = 0; i < this.size - 1; i++) {
			result = result + this.strArray[i].toString() + ", ";
		}
		
		return result + this.strArray[this.size - 1] + " ]";
	}
	
	public int size() {
		return size;
	}

	public static void main(String[] args){
		/*MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		l.remove("Mark");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l.toString());
		/*l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);*/
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l.toString());
	}

}
