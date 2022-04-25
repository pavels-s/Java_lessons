package main.java.student_pavel_sharkel.lesson_5.homeworks.level_2;

import java.util.Random;

public class Task14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            sum = sum + numbers[i];
        }
        System.out.println("Average is " + (sum / numbers.length));
    }
}
