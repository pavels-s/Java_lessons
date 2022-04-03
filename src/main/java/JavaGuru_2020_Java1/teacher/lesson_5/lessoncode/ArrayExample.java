package main.java.JavaGuru_2020_Java1.teacher.lesson_5.lessoncode;

class ArrayExample {

	public static void main(String[] args) {

		// 9, 3, 4, 6, ...

		int mark1 = 9;
		int mark2 = 3;
		int mark3 = 4;
		int mark4 = 6;


		//          |_|_|_|_|
		//index -    0 1 2 3
		int[] marks = new int[4];

		// int - 4 byte;   4 * 4 = 16 byte
		// 1000000 * 4 = 40000000 byte
		// OutOfMemoryException

		// int -> 4 byte - new int[4] -> 4 * 4 = 16 byte RAM

		// |0|0|0|0|
		printArrayToConsole(marks);

		// Primitive data type: int, float, boolean

		marks[0] = 9;
		marks[1] = 3;
		marks[2] = 4;
		marks[3] = 6;

		marks[0] = 10;

		printArrayToConsole(marks);

		int sum = marks[0] + marks[1] + marks[2] + marks[3];
		System.out.println(sum);

		// marks[4] = 0; java.lang.ArrayIndexOutOfBoundsException


		System.out.println("Array length = " + marks.length);

		marks[0] = 90;
		marks[1] = 39;
		marks[2] = 40;
		marks[3] = 99;

		printArrayToConsole(marks);

	}

	private static void printArrayToConsole(int[] marks) {
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
	}

}
