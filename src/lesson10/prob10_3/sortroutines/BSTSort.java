package lesson10.prob10_3.sortroutines;

import java.util.Collections;
import java.util.List;

import lesson10.prob10_3.runtime.*;
import lesson10.prob10_3.sortroutines.MyBST.BTreePrinter;

public class BSTSort extends Sorter{
	
	public int[] sort(int[] arr) {
		MyBST myBST = new MyBST();
		myBST.insertAll(arr);
		int[] res = myBST.readintoArray();
		return res;
	}
	public static void main(String[] args) {
		MyBST myBST = new MyBST();
		int[] temp = {3, 4, 9,1, 2};
		myBST.insertAll(temp);
		int[] res = myBST.readintoArray();
		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
