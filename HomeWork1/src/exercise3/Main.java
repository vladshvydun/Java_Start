package exercise3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input radius of a circle: ");
		double r = scanner.nextDouble();

		double c = Math.PI * 2.0 * r;
		
		System.out.println("Circumference of a circle is: " + c);
		scanner.close();
	}

}
