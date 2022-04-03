package main.java.JavaGuru_2020_Java1.lesson_10.level_6;

class BookReaderTest {

    public static void main(String[] args) {

        BookReaderTest bookReaderTest = new BookReaderTest();
        bookReaderTest.findBookByAuthorTest();

    }

    public void findBookByAuthorTest() {
        BookReader bookReader = new BookReaderImpl();
        Book book1 = new Book("My Tiltle1", "Author");
        Book book2 = new Book("My Tiltle2", "Author");
        Book book3 = new Book("My Tiltle3", "Author");
        Book book4 = new Book("My Tiltle4", "uthor");
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        bookReader.findBookByAuthor("Author");
    }
}
