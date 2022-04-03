package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_x;

import student_pavel_sharkel.lesson_5.homeworks.level_5_6.ArrayUtil;

//import java.util.Random;
import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Enter array length: ");
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();

//        int[] numbers = new int[arrayLength];
        ;
        arrayUtil.fillArrayWithRandomNumbers(arrayUtil.createArray(arrayLength));

//        for (int i = 0; i < arrayLength; i++) {
//            Random random = new Random();
//            numbers[i] = random.nextInt(100);
//            System.out.print(numbers[i] + "; ");
//        }
    }
}