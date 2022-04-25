package main.java.student_pavel_sharkel.lesson_6.homeworks.level_1.task_3;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();

    }
    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(6).equals("Fizz")) {
            System.out.println("Fizz test is OK");
        } else {
            System.out.println("Fizz test is FAILED");
        }
    }

    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(10).equals("Buzz")) {
            System.out.println("Buzz test is OK");
        } else {
            System.out.println("Buzz test is FAILED");
        }
    }

    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("FizzBuzz test is OK");
        } else {
            System.out.println("FizzBuzz test is FAILED");
        }
    }
}
