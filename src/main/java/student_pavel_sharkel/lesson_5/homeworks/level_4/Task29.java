package main.java.student_pavel_sharkel.lesson_5.homeworks.level_4;

import java.util.Random;

public class Task29 {

    public static void main(String[] args) {

        int[] numbers = new int[7];
        System.out.print("Numbers array :");

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + "; ");
        }

        System.out.println();
        System.out.print("Even numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                System.out.print(numbers[i] + "; ");
            }
        }
    }
}
