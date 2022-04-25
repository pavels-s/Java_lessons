package main.java.student_pavel_sharkel.lesson_8.level_3.task_13;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Bmw extends Cars {


    @Override
    void maxSpeed() {
        System.out.println("245 km/h");
    }

    @Override
    void manufacturer() {
        System.out.println("Germany");
    }
}
