package main.java.JavaGuru_2020_Java1.teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int number = sc.nextInt();

		System.out.println("Enter power:");
		int power = sc.nextInt();

		/*switch (power) {
			case value: {
				// commands
				break;
			}
		}
*/
		switch (power) {
			case 1: {  // power == 1
				System.out.println("Result = " + number);
				break;
			}
			case 2: { // power == 2
				System.out.println("Result = " + number * number);
				break;
			}
			case 3: { // power == 3
				System.out.println("Result = " + number * number * number);
				break;
			}
			default: {
				System.out.println("OUR Program supports only power from 1 to 3.");
				System.out.println("WE use Math.pow for calculations = " + Math.pow(number, power));
			}
		}

	}

}
