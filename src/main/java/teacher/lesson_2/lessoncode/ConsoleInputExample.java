package main.java.teacher.lesson_2.lessoncode;

import java.util.Scanner;

public class ConsoleInputExample {

	public static void main(String[] args) {
		// System.in; - input
		// System.out; - output
		// System.err; - errors

		//java.util.Scanner scanner = new java.util.Scanner(System.in);

		// Runtime - время выполнения программы

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter integer number:");
		int userNumber = scanner.nextInt();
		int power = userNumber * userNumber;

		System.out.println("User number = " + power);

		System.out.println("Please enter double number:");
		double userDoubleNumber = scanner.nextDouble();
		System.out.println("User double number = " + userDoubleNumber);
	}

}
