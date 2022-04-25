package main.java.teacher.lesson_3.lessoncode;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = sc.nextInt();

		Calculator calculator = new Calculator();

		int sumResult = calculator.sum(firstNumber, secondNumber);
		System.out.println("Sum = " + sumResult);

		int multiplyResult = calculator.multiply(firstNumber, secondNumber);
		System.out.println("Multiply = " + multiplyResult);

	}

}
