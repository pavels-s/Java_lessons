package main.java.student_pavel_sharkel.lesson_10.level_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BookReaderImpl implements BookReader{

    List<Book> bookList = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (isBookNew(book) && isFieldsFilled(book)) {
            bookList.add(book);
            return true;
        } else return false;

    }

    boolean isBookNew(Book book) {
        boolean result = true;
        for (Book list : bookList) {
            if (list.getAuthor().equals(book.getAuthor()) && list.getTitle().equals(book.getTitle())) {
                result = false;
            }
        }
        return result;
    }

    boolean isFieldsFilled(Book book) {
            if (book.getTitle().equals("") || book.getAuthor().equals("")) {
                return false;
            } else return true;

    }

    @Override
    public boolean removeBook(Book book) {
        boolean result = false;
        if (isBookNew(book) == false) {
            bookList.remove(book);
            result = true;
        }
        return result;
    }

    public void printBooks() {
        for (Book list : bookList) {
            System.out.println(list.getAuthor() + ", " + list.getTitle());
        }
    }

    @Override
    public void findBookByAuthor(String author) {

        for (Book list : bookList) {
            if (list.getAuthor().equals(author)) {
                System.out.println(list.getTitle());
            }
        }
    }
}
