package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_1.task_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        Scanner in = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int number = in.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));

        ;
        dayOfTheWeekDetectorTest.test1();
        dayOfTheWeekDetectorTest.test2();
        dayOfTheWeekDetectorTest.test3();
        dayOfTheWeekDetectorTest.test4();
        dayOfTheWeekDetectorTest.test5();
        dayOfTheWeekDetectorTest.test6();
        dayOfTheWeekDetectorTest.test7();
    }

    public void test1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(1).equals("Monday")) {
            System.out.println("Monday test is OK");
        } else {
            System.out.println("Monday test is FAILED");
        }
    }

    public void test2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(2).equals("Tuesday")) {
            System.out.println("Tuesday test is OK");
        } else {
            System.out.println("Tuesday test is FAILED");
        }
    }

    public void test3() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(3).equals("Wednesday")) {
            System.out.println("Wednesday test is OK");
        } else {
            System.out.println("Wednesday test is FAILED");
        }
    }
    public void test4() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(4).equals("Thursday")) {
            System.out.println("Thursday test is OK");
        } else {
            System.out.println("Thursday test is FAILED");
        }
    }
    public void test5() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(5).equals("Friday")) {
            System.out.println("Friday test is OK");
        } else {
            System.out.println("Friday test is FAILED");
        }
    }
    public void test6() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(6).equals("Saturday")) {
            System.out.println("Saturday test is OK");
        } else {
            System.out.println("Saturday test is FAILED");
        }
    }
    public void test7() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        if (dayOfTheWeekDetector.detectDayName(7).equals("Sunday")) {
            System.out.println("Sunday test is OK");
        } else {
            System.out.println("Sunday test is FAILED");
        }
    }
}
