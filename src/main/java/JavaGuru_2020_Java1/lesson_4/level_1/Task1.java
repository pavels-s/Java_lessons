package main.java.JavaGuru_2020_Java1.lesson_4.level_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer (not 0): ");
        int userNumber = in.nextInt();

        if (userNumber < 0) {
            System.out.println("Entered number is negative");
        } else if (userNumber > 0) {
            System.out.println("Entered number is positive");
        } else {
            System.out.println("Try again");
        }
    }
}
