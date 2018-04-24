package com.gmail.vladshvydyun;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input height:");
		int height = scanner.nextInt();

		System.out.println("Input width:");
		int width = scanner.nextInt();

		for (int i = 0; i < height; i++) {
			System.out.print("*");
			
			for (int j = 0; j < width; j++) {				
				if ((i == 0) || (i == height - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}

}
