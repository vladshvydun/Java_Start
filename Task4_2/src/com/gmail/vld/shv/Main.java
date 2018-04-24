package com.gmail.vld.shv;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input array's size:");
		int size = scanner.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(array));
		scanner.close();
	}
}