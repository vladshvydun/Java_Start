package com.gmail.vld.shv;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arrayOne = new int[15];
		int arrayOneSize = arrayOne.length;

		for (int i = 0; i < arrayOneSize; i++) {
			arrayOne[i] = random.nextInt(25);
		}
		System.out.println(Arrays.toString(arrayOne));
		
		int[] arrayTwo = new int[arrayOne.length * 2];
		int arrayTwoSize = arrayTwo.length;
		int x = 0;

		arrayTwo = Arrays.copyOf(arrayOne, arrayOneSize * 2);
		for (int j = arrayTwo.length / 2; j < arrayTwoSize; j++) {
			arrayTwo[j] = arrayOne[x] * 2;
			x++;
		}
		System.out.println(Arrays.toString(arrayTwo));
	}
}