package main.java.student_pavel_sharkel.lesson_10.level_3.task_6;

import main.java.teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
public interface NumberChecking {

    public boolean isNumberBiggerThanTen(int number);
}
