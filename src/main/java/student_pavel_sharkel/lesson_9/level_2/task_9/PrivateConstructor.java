package main.java.student_pavel_sharkel.lesson_9.level_2.task_9;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PrivateConstructor {

    private int number;
    private String name;

    private PrivateConstructor(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
