package lesson2_lab1;

import java.util.Arrays;

public class MultiArray {
	public static void main(String[] args) {
		String[][] teams = {
				{"Joe", "Bob", "Frank", "Steve"},
				{"Jon", "Tom","David","Ralph"},
				{"Tim", "Bev","Susan","Dennis"}
				};

		for(int i = 0; i < teams.length; i++){
			for(int j = 0; j < teams[i].length; j++) {
				System.out.print(teams[i][j] + ", ");
			}
			System.out.println("\n");
		}
	}	
}
