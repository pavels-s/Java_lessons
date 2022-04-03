package main.java.JavaGuru_2020_Java1.lesson_2.homeworks.day_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter second number: ");
        int secondNumber = scanner.nextInt();

		// не объявляйте переменные заранее!!
        int sum, sub, mult;
        double div;
        sum = firstNumber + secondNumber;
        sub = firstNumber - secondNumber;
        mult = firstNumber * secondNumber;
        div = (double) firstNumber / secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + div);

    }

}
