package main.java.student_pavel_sharkel.lesson_10.level_1.task_2;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
