package main.java.student_pavel_sharkel.lesson_6.homeworks.level_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {

    int[][] twoDimensionalArray = new int[4][4];

    void fillArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Random random = new Random();

                arr[i][j] = random.nextInt();
            }
        }
    }

    int arraySum (int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
