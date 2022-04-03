package main.java.JavaGuru_2020_Java1.lesson_12.level_3.task_19;

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
