package main.java.JavaGuru_2020_Java1.teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class BookListDemo {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("A", "A"));
		books.add(new Book("B", "B"));
		books.add(new Book("C", "C"));

		boolean contains = books.contains(new Book("A", "A"));
		System.out.println("Result = " + contains);

	}

}
