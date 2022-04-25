package main.java.student_pavel_sharkel.lesson_5.homeworks.level_2;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = random.nextInt(1000);
            System.out.println(i + 1 + " random number is " + numbers[i]);
        }

    }
}
