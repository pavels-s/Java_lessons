package main.java.student_pavel_sharkel.lesson_4.level_2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st integer number: ");
        int firstNumber = in.nextInt();

        System.out.println("Enter 2nd integer number: ");
        int secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is bigger");
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
