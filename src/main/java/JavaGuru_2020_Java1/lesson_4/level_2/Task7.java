package main.java.JavaGuru_2020_Java1.lesson_4.level_2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st integer number: ");
        int firstNumber = in.nextInt();

        System.out.println("Enter 2nd integer number: ");
        int secondNumber = in.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
