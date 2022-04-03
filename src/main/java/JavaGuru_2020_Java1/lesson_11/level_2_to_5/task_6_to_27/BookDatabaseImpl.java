package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase{

    Long id = 0L;
    List<Book> bookList = new ArrayList<>();

  //      Book book1 = new Book("Author1", "Title1");


    @Override
    public Long save(Book book) {
        id++;
        bookList.add(book);
        book.setId(id);
        return id;
    }

    @Override
    public boolean delete(Long bookId) {
        boolean result = false;
        if (bookId <= id) {
            bookList.remove(bookId);
            result = true;
        }
        return result;
    }

    @Override
    public boolean delete(Book book) {
        boolean result = false;
        for (Book value : bookList) {
            if (value.equals(book)) {
                bookList.remove(book);
                result = true;
            }
        }
        return result;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        Optional<Book> result = Optional.empty();
        for (Book value : bookList) {
            if (bookId == value.getId()) {
                result = Optional.of(value);
            } else result = Optional.empty();
        }
        return result;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> requestedAuthorBooks = new ArrayList<>();
        for (Book value : bookList) {
            if (value.getAuthor().equals(author)) {
                requestedAuthorBooks.add(value);
            }
        }
        return requestedAuthorBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> requestedTitleBooks = new ArrayList<>();
        for (Book value : bookList) {
            if (value.getTitle().equals(title)) {
                requestedTitleBooks.add(value);
            }
        }
        return requestedTitleBooks;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Book value : bookList) {
            if (value.getAuthor().equals(author)) {
                bookList.remove(value);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book value : bookList) {
            if (value.getTitle().equals(title)) {
                bookList.remove(value);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> sortedBookList = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                sortedBookList.add(book);
            }
        }
        return sortedBookList;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : bookList) {
            uniqueAuthors.add(book.getAuthor());

//            if (isUnique) {
//                uniqueAuthors.remove(book.getAuthor());
//            }
        }
        return uniqueAuthors;
    }

    @Override
    public List<Book> getActualList() {
        return bookList;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : bookList) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Book book : bookList) {
                uniqueBooks.add(book);
            }
        return uniqueBooks;
    }

    @Override
    public boolean contains(Book book) {
        boolean result = false;
        for (Book value : bookList) {
            if ((book.getAuthor().equals(value.getAuthor())) && (book.getTitle().equals(value.getTitle()))) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public Set<String> find(String text) {
        Set<String> foundTextList = new HashSet<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(text)) {foundTextList.add(book.getTitle());};
            if (book.getAuthor().equals(text)) {foundTextList.add(book.getAuthor());};
        }
        return foundTextList;
    }
}
