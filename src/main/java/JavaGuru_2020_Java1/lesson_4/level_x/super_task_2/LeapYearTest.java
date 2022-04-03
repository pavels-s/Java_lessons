package main.java.JavaGuru_2020_Java1.lesson_4.level_x.super_task_2;

public class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();
        leapYearTest.test2();
    }

        public void test1() {
            LeapYear test1 = new LeapYear();

            if (test1.isLeapYear(2020)) {
                System.out.println("Leap year test is OK");
            } else {
                System.out.println("Leap year test is FAILED");
            }
        }
        public void test2() {
            LeapYear test2 = new LeapYear();

            if (!test2.isLeapYear(2021)) {
                System.out.println("Not leap test is OK");
            } else {
                System.out.println("Not leap year test is FAILED");
            }
        }

    }

