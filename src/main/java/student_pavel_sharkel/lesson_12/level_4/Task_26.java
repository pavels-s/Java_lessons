package main.java.student_pavel_sharkel.lesson_12.level_4;

public class Task_26 {
    public static void main(String[] args) {
        try {
            rekursiya();
        } catch (StackOverflowError e) {
            System.out.println("StackOverFlow error happened");
        }
    }

    static void rekursiya() {
        System.out.println("Waiting for error");
        rekursiya();
    }
}
