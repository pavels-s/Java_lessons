package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_2;

import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            sum = sum + numbers[i];
        }
        System.out.println("Sum is " + sum);
    }
}
