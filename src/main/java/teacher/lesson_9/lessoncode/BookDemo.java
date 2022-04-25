package main.java.teacher.lesson_9.lessoncode;

public class BookDemo {

	public static void main(String[] args) {
		Book book1 = new Book("Star", "A");
		Book book2 = new Book("Star", "A");

		Book book3 = new Book("Star", "A");
		Book book4 = book3;

		if (book3.equals(book4)) {
			System.out.println("Book 3 equals Book 4!");
		}

		if (book3.equals(null) == false) {
			System.out.println("Book 3 not equals null!");
		}

		//Object obj = new Wallet(100, "123");
		//Book b = (Book) obj;


		Object o = new Book("A", "B");
		// o.getTitle()

		//book1 = book2;

		if (book1 == book2) {
			System.out.println("References are equals!");
		} else {
			System.out.println("References are NOT equals!");
		}

		//book2 = null;

		Car car = new Car(true, 2.0);

		if (book1.equals(book2)) {
			System.out.println("Books are equals!");
		} else {
			System.out.println("Books are NOT equals!");
		}


/*
		Book[] books = new Book[10];
		for (Book book : books) {
			System.out.println(book);
		}
*/

	}

}
