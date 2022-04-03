package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BookDatabase {

    Long save (Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    List<Book> getActualList();

    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Set<String> find(String text);

}
