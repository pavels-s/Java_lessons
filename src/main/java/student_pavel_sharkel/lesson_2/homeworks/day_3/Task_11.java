package main.java.student_pavel_sharkel.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        double average;

        average = ((double)firstNumber + (double)secondNumber + (double)thirdNumber) / 3;

        System.out.println("Average = " + average);

    }
}
