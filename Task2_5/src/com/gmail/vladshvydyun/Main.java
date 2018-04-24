package com.gmail.vladshvydyun;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input X coordinate");
		int coordinateX = scanner.nextInt();
		System.out.println("Input Y coordinate");
		int coordinateY = scanner.nextInt();
		
		if((coordinateX <=4) && (coordinateY <= 4) && (coordinateX >= -4) && (coordinateY >= -4)) {
			System.out.println("The point lies inside the circle");
		} else {
			System.out.println("The point is NOT lies inside the circle");
		}
		scanner.close();
	}

}
