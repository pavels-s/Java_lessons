package main.java.teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class WhileFindANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = {1, 2, 3, 4, 5, 6};

		System.out.println("Please enter a number what you want to find:");
		int numberToFind = scanner.nextInt();

		int i = 0;
		boolean isNumberFound = false;
		while (i < arr.length) {
			int number = arr[i];
			if (number == numberToFind) {
				isNumberFound = true;
				break;
			}
			i++;
		}

		if (isNumberFound == true) {
			System.out.println("Number is found");
		} else {
			System.out.println("Number is not found");
		}


	}

}
