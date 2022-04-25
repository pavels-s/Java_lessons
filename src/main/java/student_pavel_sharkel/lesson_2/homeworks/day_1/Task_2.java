package main.java.student_pavel_sharkel.lesson_2.homeworks.day_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number with floating point: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number with floating point: ");
        double secondNumber = scanner.nextDouble();

        double sum, sub, mult, div;  // не объявляйте переменные заранее!!
		sum = firstNumber + secondNumber;
        sub = firstNumber - secondNumber;
        mult = firstNumber * secondNumber;
        div =  firstNumber / secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mult);
        System.out.println("Division = " + div);

    }

}
