package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_4;

import java.util.Random;

public class Task27 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);

            System.out.println(numbers[i] + "; ");


            if (i == 0) {
                max = numbers[i];
            } else if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.print("Max number is " + max);
    }
}
