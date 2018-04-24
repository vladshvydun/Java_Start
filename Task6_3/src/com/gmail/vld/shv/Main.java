package com.gmail.vld.shv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Input number in binary format:");
		sb.append(scanner.nextLine());
		sb.reverse();
		String input = sb.toString();

		char[] inputArray = input.toCharArray();
		int[] binaryArray = new int[inputArray.length];

		for (int i = 0; i < binaryArray.length; i++) {
			binaryArray[i] = Character.getNumericValue(inputArray[i]);
		}
		System.out.println(Arrays.toString(binaryArray));

		int[] decimalArray = new int[inputArray.length];
		int decimalNumber = 0;
		for (int j = 0; j < decimalArray.length; j++) {
			if (binaryArray[j] == 0) {
				continue;
			} else {
				decimalArray[j] = (int) Math.pow(2, j);
				decimalNumber += decimalArray[j];
			}
		}
		System.out.println(Arrays.toString(decimalArray));
		System.out.println(input + " in decimal format: " + decimalNumber);

	}

}
