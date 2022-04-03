package main.java.JavaGuru_2020_Java1.lesson_12.level_4;

import java.util.ArrayList;

public class Task_25 extends OutOfMemoryError {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            while (true) {
                numbers.add(10000*10000);
            }
        }    catch (OutOfMemoryError e) {
            System.out.println("Too much memory for adding");
        }
    }
}
