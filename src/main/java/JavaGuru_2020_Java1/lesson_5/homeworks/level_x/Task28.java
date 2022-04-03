package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_x;

import student_pavel_sharkel.lesson_5.homeworks.level_5_6.ArrayUtil;

public class Task28 {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);



//        for (int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            numbers[i] = random.nextInt(100);
//            System.out.println(numbers[i] + "; ");
//        }
//        int min = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (min > numbers[i]) {
//                min = numbers[i];
//            }
//        }
        System.out.println("Min number is " + arrayUtil.findMinNumber(numbers));
    }
}
