package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_1.task_1;

import java.util.Scanner;

class Calculator {

    public int getNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        return number;

    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

}
