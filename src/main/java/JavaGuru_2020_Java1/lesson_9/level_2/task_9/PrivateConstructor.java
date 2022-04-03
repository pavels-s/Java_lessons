package main.java.JavaGuru_2020_Java1.lesson_9.level_2.task_9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PrivateConstructor {

    private int number;
    private String name;

    private PrivateConstructor(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
