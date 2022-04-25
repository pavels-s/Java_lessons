package main.java.student_pavel_sharkel.lesson_5.homeworks.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + "; ");
        }
    }
}
