package main.java.JavaGuru_2020_Java1.lesson_4.level_3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st integer number: ");
        int firstNumber = in.nextInt();

        System.out.println("Enter 2nd integer number: ");
        int secondNumber = in.nextInt();

        System.out.println("Enter 3rd integer number: ");
        int thirdNumber = in.nextInt();

        if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Numbers are decreasing");
        } else if ((firstNumber < secondNumber) && (secondNumber < thirdNumber) && (firstNumber < thirdNumber))  {
            System.out.println("Numbers are increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
