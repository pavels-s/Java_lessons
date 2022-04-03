package main.java.JavaGuru_2020_Java1.lesson_9.level_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(150, 200);

        System.out.println("In safe we have USD: " + safe.dollars);
        System.out.println("In safe we have EUR: " + safe.euros);
    }
}
