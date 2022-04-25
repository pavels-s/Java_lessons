package main.java.student_pavel_sharkel.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongInputUserHandlingDemo {
    public static void main(String[] args) {


        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Insert number: ");
                in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please insert number");
            }
        }
    }
}
