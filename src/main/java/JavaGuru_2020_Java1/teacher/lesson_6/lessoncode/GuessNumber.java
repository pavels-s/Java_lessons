package main.java.JavaGuru_2020_Java1.teacher.lesson_6.lessoncode;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		String userAnswer = "";

		while (!userAnswer.equals("=")) {
			int guessedNumber = random.nextInt(100);
			System.out.println("Your number is " + guessedNumber);

			userAnswer = scanner.nextLine();
		}

		System.out.println("Yes we guessed correctly!");
	}

}
