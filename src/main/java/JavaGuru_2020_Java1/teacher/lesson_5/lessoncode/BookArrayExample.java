package main.java.JavaGuru_2020_Java1.teacher.lesson_5.lessoncode;

public class BookArrayExample {

	public static void main(String[] args) {

		Book[] books = new Book[4];

		Book book1 = new Book("A", "B1");
		Book book2 = new Book("A", "B2");
		Book book3 = new Book("A", "B3");
		Book book4 = new Book("A", "B4");

		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		books[3] = book4;

		books[0] = book2;


		Book book5 = new Book("A", "B5");
		book5 = new Book("A", "B6");


		Book b = books[0];
		b.setAuthor("Pupkin");


		String[] studentNames = new String[3];
		studentNames[0] = "Vasja A";
		studentNames[1] = "Petja B";
		studentNames[2] = "Tanja C";

		studentNames[0] = new String("Vasja XXXX");
	}

}
