package main.java.JavaGuru_2020_Java1.lesson_4.level_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer or 0: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 0) {
            System.out.println("Your number is negative");
        } else if (userNumber > 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is zero");
        }
    }
}
