package main.java.JavaGuru_2020_Java1.teacher.lesson_9.lessoncode;

class BookToStringDemo {

	public static void main(String[] args) {
		Book book = new Book("Star", "A");

		System.out.println("Author = " + book.getAuthor());
		System.out.println("Title = " + book.getTitle());

		System.out.println(book.toString());

		System.out.println(book);
	}

}
