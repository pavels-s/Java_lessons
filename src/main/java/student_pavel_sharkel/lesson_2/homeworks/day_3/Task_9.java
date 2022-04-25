package main.java.student_pavel_sharkel.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int myNumber = scanner.nextInt();

        for(int i = 1; i < 11; i++) {
            result = i * myNumber;
            System.out.println(myNumber + " x " + i + " = " + result);
        }

    }
}
