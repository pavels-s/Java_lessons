package main.java.JavaGuru_2020_Java1.lesson_8.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Toyota extends Cars {

    @Override
    void maxSpeed() {
        System.out.println("213 km/h");
    }

    @Override
    void manufacturer() {
        System.out.println("Japan");
    }


}
