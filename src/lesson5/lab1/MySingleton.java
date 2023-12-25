package lesson5.lab1;

public class MySingleton {

    private static MySingleton instance;

    public static MySingleton getInstance() {
    	// This is static variables, so it cannot change the value after initiation.
    	return instance;
    }

    // Create new instance at the static block, that's why user cannot
    // create another one.
    static {
        instance = new MySingleton();
    }
    
    public static void main(String[] args) {
        MySingleton singleton1 = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();
        System.out.println("Both singleton are same: " + (singleton1 == singleton2));
    }
}

