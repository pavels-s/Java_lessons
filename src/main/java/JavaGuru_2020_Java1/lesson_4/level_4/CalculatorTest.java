package main.java.JavaGuru_2020_Java1.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
        calculatorTest.maxOfThreeNumbers7();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test is OK");
        } else {
            System.out.println("Sum test is FAILED");
        }
    }

    public void subTest() {
        int firstNumber = 10, secondNumber = 5;

        Calculator calculator = new Calculator();

        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test is OK");
        } else {
            System.out.println("Subtraction test if FAILED");
        }
    }

    public void multTest() {
        int firstNumber = 10, secondNumber = 5;

        Calculator calculator = new Calculator();

        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test is OK");
        } else {
            System.out.println("Multiplication test if FAILED");
        }
    }

    public void divTest() {
        int firstNumber = 10, secondNumber = 5;

        Calculator calculator = new Calculator();

        double result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test is OK");
        } else {
            System.out.println("Division test is FAILED");
        }
    }

    public void isEvenTest() {
        int firstNumber = 5, secondNumber = 10;

        Calculator calculator = new Calculator();
        boolean result1 = calculator.isEven(firstNumber);
        boolean result2 = calculator.isEven(secondNumber);

        if ((result1 == false) && (result2 == true)) {
            System.out.println("Even test is OK");
        } else {
            System.out.println("Even test is FAILED");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 5, secondNumber = 10;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == secondNumber) {
            System.out.println("Max of two numbers test is OK");
        } else {
            System.out.println("Max of two numbers test if FAILED");
        }
    }

    public void maxOfThreeNumbers1() {
        int firstNumber = 10, secondNumber = 5, thirdNumber = 7;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("Max of three numbers test(1st bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(1st bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers2() {
        int firstNumber = 5, secondNumber = 10, thirdNumber = 7;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == secondNumber) {
            System.out.println("Max of three numbers test(2nd bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(2nd bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers3() {
        int firstNumber = 5, secondNumber = 10, thirdNumber = 17;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == thirdNumber) {
            System.out.println("Max of three numbers test(3rd bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(3rd bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers4() {
        int firstNumber = 10, secondNumber = 10, thirdNumber = 7;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("Max of three numbers test(1st/2nd bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(1st/2nd bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers5() {
        int firstNumber = 7, secondNumber = 10, thirdNumber = 10;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == secondNumber) {
            System.out.println("Max of three numbers test(2nd/3rd bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(2nd/3rd bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers6() {
        int firstNumber = 10, secondNumber = 7, thirdNumber = 10;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("Max of three numbers test(1st/3rd bigger) is OK");
        } else {
            System.out.println("Max of three numbers test(1st/3rd bigger) is FAILED");
        }
    }

    public void maxOfThreeNumbers7() {
        int firstNumber = 10, secondNumber = 10, thirdNumber = 10;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("Max of three numbers test(all equals) is OK");
        } else {
            System.out.println("Max of three numbers test(all equals) is FAILED");
        }
    }
}
