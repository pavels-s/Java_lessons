package main.java.student_pavel_sharkel.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = in.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = in.nextInt();

        System.out.println("Enter third number:");
        int thirdNumber = in.nextInt();

        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            System.out.println("Max is " + firstNumber);
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            System.out.println("Max is " + secondNumber);
        } else if ((thirdNumber >= firstNumber) && (thirdNumber >= secondNumber)) {
            System.out.println("Max is " + thirdNumber);
        }
    }
}
