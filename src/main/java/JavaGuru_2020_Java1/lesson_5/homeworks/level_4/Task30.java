package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_4;

import java.util.Random;

public class Task30 {

    public static void main(String[] args) {

        int[] numbers = new int[8];
        System.out.print("Numbers array: ");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + "; ");
        }

        System.out.println();
        System.out.print("Not even numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers [i] % 2) == 1) {
                System.out.print(numbers[i] + "; ");
            }
        }

    }
}
