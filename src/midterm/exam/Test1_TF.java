package midterm.exam;

class One {
	static int first = 60;

	public void print() {
		System.out.print(first);
	}
}

class Two {
	static int sec = 60;

	void print() {
		System.out.print(sec);
	}
}

class Test1_TF {
	public static void main(String[] args) {
		One one = new One();
		Two two = new Two();
		One three = one;
		three.first = 70;
		System.out.print(one.first);
		System.out.print(three.first);
	}
}
