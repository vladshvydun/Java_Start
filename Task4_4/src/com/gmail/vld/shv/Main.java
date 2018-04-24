package com.gmail.vld.shv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input text and press Enter:");
		String inputText = scanner.nextLine();
		int number = 0;

		char[] array = inputText.toCharArray();
		System.out.println(Arrays.toString(array));

		for (int i = 0, arraySize = array.length; i < arraySize; i++) {
			if (array[i] == 'b') {
				number++;
			}
		}
		System.out.println("In the text " + number + " letters 'b'.");
		scanner.close();
	}
}