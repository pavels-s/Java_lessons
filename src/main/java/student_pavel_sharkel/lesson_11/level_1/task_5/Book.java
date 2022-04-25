package main.java.student_pavel_sharkel.lesson_11.level_1.task_5;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}
