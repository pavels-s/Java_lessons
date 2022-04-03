package main.java.JavaGuru_2020_Java1.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int userNumber = in.nextInt();

        if (userNumber % 2 == 0) {
            System.out.println("Even number");
        } else if (userNumber % 2 == 1) {
            System.out.println("Odd number");
        }
    }
}
