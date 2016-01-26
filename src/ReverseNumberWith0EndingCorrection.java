/**
 * THIS PROGRAM REVERSES A NUMBER USING MATHEMATICAL OPERATIONS.
 */

// On the next line, we import scanner to get user input later.
import java.util.Scanner;

public class ReverseNumberWith0EndingCorrection {

	public static void main(String[] args) {

		System.out.println("NUMBER REVERSAL PROGRAM v0.00.000.00002");
		System.out.println("Created By: Matt Anderson for Grand Circus Detroit's Java Bootcamp");
		System.out.println(" ");
		System.out.println("NOTE: This program version is capable of reversing a positive whole integer such as 123, 987234, etc. It is incapable of reversing a negative integer or decimal numbers.");
		System.out.println(" ");
		System.out.print("Enter the number that you would like to reverse: "); // Here I use print instead of println so the user input will be on the same line.

		// The next line calls Scanner into play so we can get some user input.
		Scanner read = new Scanner(System.in);
		int originalNumber = read.nextInt(); // originalNumber is the number that the user inputs.
		if (originalNumber % 10 == 0) {
			System.out.print("Reverse of " + originalNumber + " is: ");
			int temp = originalNumber;
			for (int i = 1; i <= 9; i++) {
				System.out.print(0); // This line must be print instead of println otherwise the padded 0 will be on a separate line.
				temp = temp / 10;
				if (temp % 10 != 0) {
					break;
				}
			}
			System.out.println(REV(originalNumber));
		} else {
			System.out.println("Reverse of " + originalNumber + " is: " + REV(originalNumber));
		}
	}

	static int REV(int n) {

		long Temp, RevNumber = 0;
		Temp = n;
		while (Temp > 0) {
			RevNumber = (RevNumber * 10) + (Temp % 10);
			Temp = Temp / 10;
		}
		return (int) RevNumber;
	}
}