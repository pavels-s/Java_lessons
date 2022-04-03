package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int i;

        for (i = 0; i < numbers.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number: ");
            numbers[i] = in.nextInt();
            System.out.println(i + 1 + " number is " + numbers[i]);
        }
    }
}
