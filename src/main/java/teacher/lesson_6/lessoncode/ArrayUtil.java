package main.java.teacher.lesson_6.lessoncode;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

	public void printArrayToConsole(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Arr element = " + arr[i]);
		}
	}

	public String convertArrayToString(int[] arr) {
		String str = "{";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i];
			if (i < arr.length - 1) {
				str = str + ",";
			}
		}
		return str + "}";
	}

	public int getArrayLengthFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arrLength = sc.nextInt();
		return arrLength;
	}

	public int[] createArray(int arrayLength) {
		return new int[arrayLength];
	}

	public void fillArrayWithNumbersFromUser(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array element: ");
			arr[i] = sc.nextInt();
		}
	}

	public void fillArrayWithRandomNumbers(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1000);
		}
	}


}
