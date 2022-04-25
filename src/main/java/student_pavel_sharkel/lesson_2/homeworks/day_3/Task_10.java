package main.java.student_pavel_sharkel.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double perimeter, area, pi = (3.141592653589);


        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        area = radius * radius * pi;
        perimeter = 2 * radius * pi;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
