package main.java.JavaGuru_2020_Java1.lesson_11.level_1.task_5;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookListContainsDemo {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title3");
        Book book3 = new Book("Author3", "Title3");
        Book book4 = new Book("Author4", "Title4");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        BookListContainsDemo bookListContainsDemo = new BookListContainsDemo();
        System.out.println("Book is already in a list: " + bookListContainsDemo.isBookInList(bookList, "Author3", "Title3"));

    }

    boolean isBookInList(ArrayList<Book> bookList, String author, String title) {
        boolean result = false;
        for (Book value : bookList) {
            if (value.getAuthor().equals(author) && value.getTitle().equals(title)) {
                result = true;
            }
        }
            return result;
        }


}
