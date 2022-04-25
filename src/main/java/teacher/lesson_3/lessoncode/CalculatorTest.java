package main.java.teacher.lesson_3.lessoncode;

class CalculatorTest {

    public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
    	calculatorTest.test1();
        calculatorTest.test2();
    }

    public void test1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(5, 10);
        if (actualResult == 15) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(10, -10);
        if (actualResult == 0) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

}
