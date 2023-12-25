package lesson9.prob9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
//	char[] left;
//	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	//@SuppressWarnings("unused")
	boolean symbolsBalanced(String delimiters) {
		// implement
		Stack<String> strStack = new Stack<>();
		boolean res;
		char delimi;
		char[] left = new char[delimiters.length()/2];
		char[] right = new char[delimiters.length()/2];
		int l = 0; int k = 0;
		for (int i = 0; i < delimiters.length(); i++) {
			delimi = delimiters.charAt(i);
			if (delimi == '[' || delimi == '{' || delimi == '<' || delimi == '(') {
				left[l] = delimiters.charAt(i);
				l++;
			}
			if (delimi == ']' || delimi == '}' || delimi == '>' || delimi == ')') {
				right[k] = delimiters.charAt(i);
				k++;
			}
		}

		for (int i = 0; i < text.length(); i++) {
			char val = text.charAt(i);
			for(int j = 0; j < left.length; j++){
				if(val == left[j]) {
					strStack.push(String.valueOf(val));
				}
			}
			
			for(int j = 0; j < right.length; j++){
				if(val == left[j]) {
					strStack.pop();
				}
			}
			
		}

		if (strStack.size() == 0)
			res = true;
		else
			res = false;

		return res;
	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("lesson9\\prob9_2\\Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()"));
	}

	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}
	
}
