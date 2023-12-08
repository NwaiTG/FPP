package lesson3.assignment3;

public class ArrayCopy {
	public static void main(String[] args) {
		int s[] = {1, 2, 3, 4, 5, 6};
		int d[] = {10, 20, 30, 40, 50, 60};
		
		int source_arr[], sourcePos, dest_arr[], destPos, len;
		source_arr = s;
		sourcePos = 5;
		dest_arr = d;
		destPos = 5;
		len = 1;
		
		System.out.print("source_array : ");
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
        System.out.println("");
        
        System.out.println("sourcePos : " + sourcePos);
        
        // Print elements of source
        System.out.print("dest_array : ");
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i] + " ");
        System.out.println("");
        
        System.out.println("destPos : " + destPos);
        
        System.out.println("len : " + len);
		
		System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
		
		System.out.print("final dest_array : ");
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i] + " ");
	}	
}
