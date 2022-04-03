package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_x;

import student_pavel_sharkel.lesson_5.homeworks.level_5_6.ArrayUtil;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = in.nextInt();

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(arrayLength);

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = in.nextInt();
        }

        arrayUtil.printArrayToConsole(numbers);
//        for (int i = 0; i < arrayLength; i++) {
//            System.out.print(numbers[i] + "; ");
//        }
    }
}
