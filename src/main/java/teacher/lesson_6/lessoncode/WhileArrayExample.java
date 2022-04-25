package main.java.teacher.lesson_6.lessoncode;

public class WhileArrayExample {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4};

		int i = 0;
		while (i < arr.length) {
			int number = arr[i];
			System.out.println("Number = " + number);
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			int number = arr[i];
			System.out.println("Number = " + number);
		}

	}


}
