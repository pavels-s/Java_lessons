package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {


    int intoPower(int number, int power) {
        int newNumber = number;
        for (int i = 2; i <= power; i++) {
            newNumber = newNumber * number;
        }
        return newNumber;
    }
}
