package main.java.student_pavel_sharkel.lesson_4.level_2;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int firstNumber = in.nextInt();

        System.out.println("Enter 2nd number: ");
        int secondNumber = in.nextInt();

        if (secondNumber < firstNumber) {
            System.out.println(secondNumber + " is smaller");
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}
