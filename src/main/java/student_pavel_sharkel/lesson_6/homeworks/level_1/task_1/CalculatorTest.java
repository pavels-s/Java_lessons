package main.java.student_pavel_sharkel.lesson_6.homeworks.level_1.task_1;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.isEvenTest();
        calculatorTest.notEvenTest();

    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();

        if (calculator.isEven(4)) {
            System.out.println("IsEven test is OK");
        } else {
            System.out.println("IsEven test is FAILED");
        }
    }

    public void notEvenTest() {
        Calculator calculator = new Calculator();

        if (calculator.isEven(3)) {
            System.out.println("NotEven test is FAILED");
        } else {
            System.out.println("NotEven test is OK");
        }
    }
}
