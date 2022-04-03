package main.java.JavaGuru_2020_Java1.teacher.lesson_12.lessoncode;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number ;
		while (true) {
			try {
				System.out.println("Enter number: ");
				number = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Mistake, please enter number!");
			}
		}

		System.out.println("Your number = " + number);

	}

}
