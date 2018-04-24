package com.gmail.vladshvydyun;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 numbers: ");
		int numbers = scanner.nextInt();
		
		int numberOne = numbers / 10000;
		int numberTwo = numbers % 10000 / 1000;
		int numberThree = numbers % 1000 / 100;
		int numberFour = numbers % 100 / 10;
		int numberFive = numbers % 10;
		
		System.out.println(numberOne);
		System.out.println(numberTwo);
		System.out.println(numberThree);
		System.out.println(numberFour);
		System.out.println(numberFive);
	}

}
