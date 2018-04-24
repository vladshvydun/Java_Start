package com.gmail.vld.shv;

import java.util.*;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much money do you have?");
		String str = scanner.nextLine();

		String[] numbers = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tenth = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		String[] split = str.split("[,.]");
		char[] split1 = split[0].toCharArray();
		char[] split2 = split[1].toCharArray();

		int[] dollars = new int[split1.length];
		for (int i = 0; i < split1.length; i++) {
			dollars[i] = Character.getNumericValue(split1[i]);
		}
		System.out.print(Arrays.toString(dollars));

		int[] cents = new int[split2.length];
		for (int j = 0; j < split2.length; j++) {
			cents[j] = Character.getNumericValue(split2[j]);
		}
		System.out.println(Arrays.toString(cents));

		// доллары от 1 до 9
		if (dollars.length == 1) {
			for (int i = 0; i < 10; i++) {
				if (dollars[0] == 0) {
					continue;
				}
				if (dollars[0] == 1) {
					System.out.println(numbers[1] + " dollar ");
					break;
				}
				if (i == dollars[0] && i > 1) {
					System.out.println(numbers[i] + " dollars ");
				}
			}
		}

		// доллары от 10 до 99
		if (dollars.length == 2) {
			// доллары от 10 до 19
			if ((dollars[0] == 1) && (dollars[1] >= 0) && (dollars[1] < 10)) {
				System.out.println(numbers[(dollars[1] + 10)] + " dollars ");
			}

			// доллары от 20 до 90
			// 10,20,30..
			if ((dollars[0] > 1) && (dollars[0] < 10) && (dollars[1] == 0)) {
				System.out.println(tenth[dollars[0]] + " dollars");
			}
			// 23,65,45...
			if ((dollars[0] > 2) && (dollars[1] < 10) && (dollars[1] > 0)) {
				System.out.println(tenth[dollars[0]] + " " + numbers[dollars[1]] + " dollars");
			}
		}

		// доллары от 100 до 999
		if (dollars.length == 3) {
			if ((dollars[0] > 0) && (dollars[0] < 10) && (dollars[1] == 0) && (dollars[2] == 0)) {
				System.out.print(numbers[dollars[0]] + " hundred dollars ");
			} else if ((dollars[0] > 0) && (dollars[0] < 10)) {
				System.out.print(numbers[dollars[0]] + " hundred ");
			}
			if ((dollars[0] > 0) && (dollars[1] > 0) && (dollars[1] < 10) && (dollars[2] == 0)) {
				System.out.print(tenth[dollars[1]] + " dollars");
			} else if ((dollars[0] > 0) && (dollars[1] > 0) && (dollars[1] < 10) && (dollars[2] > 0)) {
				System.out.print(tenth[dollars[1]] + " " + numbers[dollars[2]] + " dollars");
			} else if ((dollars[0] > 0) && (dollars[1] == 0) && (dollars[2] < 10)) {
				if (dollars[2] == 1) {
					System.out.print(numbers[dollars[2]] + " dollar");
				} else {
					System.out.print(numbers[dollars[2]] + " dollars");
				}
			}
		}
		// от 1000 до 9999
		if (dollars.length == 4) {
			if ((dollars[0] > 0) && (dollars[0] < 10)) {
				System.out.print(numbers[dollars[0]] + " thousand ");
			}
			if ((dollars[1] > 0) && (dollars[1] < 10) && (dollars[2] == 0) && (dollars[3] == 0)) {
				System.out.print(numbers[dollars[1]] + " hundred dollars ");
			} else if ((dollars[1] > 0) && (dollars[1] < 10)) {
				System.out.print(numbers[dollars[1]] + " hundred ");
			}
			if ((dollars[1] > 0) && (dollars[2] > 0) && (dollars[2] < 10) && (dollars[3] == 0)) {
				System.out.print(tenth[dollars[2]] + " dollars");
			} else if ((dollars[1] > 0) && (dollars[2] > 0) && (dollars[2] < 10) && (dollars[3] > 0)) {
				System.out.print(tenth[dollars[2]] + " " + numbers[dollars[3]] + " dollars");
			} else if ((dollars[1] > 0) && (dollars[2] == 0) && (dollars[3] < 10)) {
				if (dollars[3] == 1) {
					System.out.print(numbers[dollars[3]] + " dollar");
				} else {
					System.out.print(numbers[dollars[3]] + " dollars");
				}
			}
		}
		if (dollars.length == 5) {
			if ((dollars[0] == 1) && (dollars[1] >= 0) && (dollars[1] < 10)) {
				System.out.print(numbers[(dollars[1] + 10)] + " thousand ");
			}
			if ((dollars[0] > 1) && (dollars[0] < 10) && (dollars[1] == 0)) {
				System.out.print(tenth[dollars[0]] + " thousand ");
			}
			if ((dollars[0] > 2) && (dollars[1] < 10) && (dollars[1] > 0)) {
				System.out.print(tenth[dollars[0]] + " " + numbers[dollars[1]] + " thousand ");
			}

			if ((dollars[2] == 0) && (dollars[3] == 0)) {
				System.out.print(numbers[dollars[4]] + " dollars ");
			}
			if ((dollars[2] > 0) && (dollars[2] < 10) && (dollars[3] == 0) && (dollars[4] == 0)) {
				System.out.print(numbers[dollars[2]] + " hundred dollars ");
			} else if ((dollars[2] > 0) && (dollars[2] < 10)) {
				System.out.print(numbers[dollars[2]] + " hundred ");
			}
			if ((dollars[2] > 0) && (dollars[3] > 0) && (dollars[3] < 10) && (dollars[4] == 0)) {
				System.out.print(tenth[dollars[3]] + " dollars");
			} else if ((dollars[2] > 0) && (dollars[3] > 0) && (dollars[3] < 10) && (dollars[4] > 0)) {
				System.out.print(tenth[dollars[3]] + " " + numbers[dollars[4]] + " dollars");
			} else if ((dollars[2] > 0) && (dollars[3] == 0) && (dollars[4] < 10)) {
				if (dollars[4] == 1) {
					System.out.print(numbers[dollars[4]] + " dollar");
				} else {
					System.out.print(numbers[dollars[4]] + " dollars");
				}
			}
		}
	}
}
