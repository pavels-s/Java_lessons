package main.java.teacher.lesson_5.lessoncode;

import java.util.Random;

class ForArrayExample {

	public static void main(String[] args) {
		int[] randomNumbers = createArray();
		fillArrayWithRandomNumbers(randomNumbers);
		printArrayToConsole(randomNumbers);

		int sum = 0;
		for (int i = 0; i < randomNumbers.length; i++) {
			sum = sum + randomNumbers[i];

			/*for (int j = 0; j < 3; j++) {
				sum = sum + randomNumbers[i];
			}*/
		}
		System.out.println("Array sum = " + sum);

	}

	private static void printArrayToConsole(int[] randomNumbers) {
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println(randomNumbers[i]);
		}
	}

	private static void fillArrayWithRandomNumbers(int[] randomNumbers) {
		Random random = new Random();
		for (int i = 0; i < randomNumbers.length; i++) {
			// int randomNumber = random.nextInt(10000);
			// randomNumbers[i] = randomNumber;
			randomNumbers[i] = random.nextInt(10000);
		}
	}

	private static int[] createArray() {
		return new int[1000];
	}

}
