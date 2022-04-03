package main.java.JavaGuru_2020_Java1.lesson_4.level_x.super_task_1;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
    }

        public void test1() {
            FizzBuzz test1 = new FizzBuzz();

            if (test1.detect(6).equals("Fizz")) {
                System.out.println("Div 3 test is OK");
            } else {
                System.out.println("Div 3 test is FAILED");
            }
        }

        public void test2() {
            FizzBuzz test2 = new FizzBuzz();

            if (test2.detect(10).equals("Buzz")) {
                System.out.println("Div 5 test is OK");
            } else {
                System.out.println("Div 5 test is FAIlED");
            }
        }

        public void test3() {
            FizzBuzz test3 = new FizzBuzz();

            if (test3.detect(45).equals("FizzBuzz")) {
                System.out.println("Div 3 and 5 is OK");
            } else {
                System.out.println("Div 3 and 5 test is FAILED");
            }
        }

        public void test4() {
            FizzBuzz test4 = new FizzBuzz();

            if (test4.detect(2).equals("2")) {
                System.out.println("No div test is OK");
            } else {
                System.out.println("No div test is FAILED");
            }
        }

}
