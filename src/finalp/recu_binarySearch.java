package finalp;

import finalp.recu_arrangeString;

public class recu_binarySearch {
//	public static void main(String[] args) {
//		System.out.print(binarySearch("qebdgjoa", 'd'));
//	}

	static boolean binarySearch(String str, char c) {
		recu_arrangeString stringSort = new recu_arrangeString();
		if (str == null || str.isEmpty())
			return false;
		if (str.length() == 1)
			return str.charAt(0) == c;
		str = stringSort.sort(str);
		int mid = str.length() / 2;
		if(str.charAt(mid) == c) return true;
		else if (str.charAt(mid) > c)
			return binarySearch(str.substring(0, mid), c);
		else
			return binarySearch(str.substring(mid + 1), c);
	}

	public static void main(String[] args) {
		System.out.println(binarySearch("qwdbgjo", 'd'));
//		System.out.println(binarySearch("bdgjoqw", 'd'));
	}

//	static boolean binarySearch(String str, char c) {
//		if (str == null)
//			return false;
//		if (str.length() == 1)
//			return str.indexOf(c) == c;
//		recu_arrangeString stringSort = new recu_arrangeString();
//		str = stringSort.sort(str);
//		int mid = str.length() / 2;
//		int cIndex = str.indexOf(c) + 1;
//		char val = str.charAt(c);
//		String str1 = str.substring(0, mid);
//		String str2 = str.substring(mid, str.length());
//		if (mid == 1 && cIndex == 1)
//			return str.indexOf(c) == mid;
//		else {
//			return (cIndex < mid) ? binarySearch(str.substring(0, mid), c)
//					: binarySearch(str.substring(mid, str.length()), c);
//		}
//
//	}
}
