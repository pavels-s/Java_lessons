package main.java.teacher.lesson_4.lessoncode;

public class MaxOfTwoNumbersTest {

	public static void main(String[] args) {
		MaxOfTwoNumbersTest test = new MaxOfTwoNumbersTest();
		test.test1();
		test.test2();
		test.test3();
	}

	public void test1() {
		int number1 = 10;
		int number2 = 1;

		MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
		int result = maxOfTwoNumbers.max(number1, number2);

		if (result == 10) {
			System.out.println("TEST 1 OK!");
		} else {
			System.out.println("TEST 1 FAIL!");
		}
	}

	public void test2() {
		int number1 = 10;
		int number2 = 100;

		MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
		int result = maxOfTwoNumbers.max(number1, number2);

		if (result == 100) {
			System.out.println("TEST 2 OK!");
		} else {
			System.out.println("TEST 2 FAIL!");
		}
	}

	public void test3() {
		int number1 = 10;
		int number2 = 10;

		MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
		int result = maxOfTwoNumbers.max(number1, number2);

		if (result == 10) {
			System.out.println("TEST 3 OK!");
		} else {
			System.out.println("TEST 3 FAIL!");
		}
	}

}
