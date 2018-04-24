package com.gmail.vld.shv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input height:");
		int height = scanner.nextInt();
		System.out.println("Input weight:");
		int weight = scanner.nextInt();

		drawRectangle(height, weight);
		scanner.close();
	}

	public static void drawRectangle(int height, int weight) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= weight; j++) {
				if (i == 1 || i == height || j == 1 || j == weight) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
