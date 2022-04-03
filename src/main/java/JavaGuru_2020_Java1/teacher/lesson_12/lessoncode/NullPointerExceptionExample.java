package main.java.JavaGuru_2020_Java1.teacher.lesson_12.lessoncode;

import teacher.lesson_10.lessoncode.library.Book;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		numbers[777] = 33;

		Book book = null;
		book.toString();

	}

}
