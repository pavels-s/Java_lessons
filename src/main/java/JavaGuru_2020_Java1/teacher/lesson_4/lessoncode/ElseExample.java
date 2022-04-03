package main.java.JavaGuru_2020_Java1.teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class ElseExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int number1 = sc.nextInt();

		System.out.println("Enter second number:");
		int number2 = sc.nextInt();

		/*if (number1 > number2) {
			System.out.println("Number 1 > number 2!");
		} else {
			if (number2 > number1) {
				System.out.println("Number 1 < number 2!");
			} else {
				System.out.println("Number 1 = number 2!");
			}
		}*/

		/*if (number1 > number2) {
			System.out.println("Number 1 > number 2!");
		} else if (number2 > number1) {
			System.out.println("Number 1 < number 2!");
		} else {
			System.out.println("Number 1 = number 2!");
		}*/

		if (number1 > number2) {
			System.out.println("Number 1 > number 2!");
		}
		if (number2 > number1) {
			System.out.println("Number 1 < number 2!");
		}
		if (number2 == number1) {
			System.out.println("Number 1 = number 2!");
		}

		System.out.println("Good by!");

		/*
		if (condition) {
			// commands condition = true
		} else {
			// commands condition = false
		}
		*/
	}


	// Tests

	// number1 and number2

	// Testcase 1: number1 = 1, number2 = 2;
	// result: number1 < number2

	// Testcase 2: number1 = 10, number2 = 3;
	// result: number1 > number2

	// Testcase 3: number1 = 10, number2 = 10;
	// result: number1 = number2

}
