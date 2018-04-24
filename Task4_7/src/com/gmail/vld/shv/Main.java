package com.gmail.vld.shv;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you have?");
		String input = scanner.nextLine();
		String[] moneyString = input.split("[,.]");
		int[] money = new int[moneyString.length];
		int x = 0;
		
		for (int i = 0; i < moneyString.length; i++) {
			money[i] = Integer.parseInt(moneyString[i]);
		}
		System.out.println(Arrays.toString(money));

		String[] singleNumbers = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		
		String[] dicimalNumbers = new String[] { "", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
		"ninety" };

		if (money[0] == 1) {
			System.out.print("You have: " + singleNumbers[money[0]] + " dollar ");
			if(money[1] < 10) {
				System.out.print(dicimalNumbers[money[1]] + " cents");
			}
		}

		if (money[0] < 10 && money[0] != 1) {
			System.out.println("You have: " + singleNumbers[money[0]] + " dollars");
		}
	}
}
