package main.java.JavaGuru_2020_Java1.teacher.lesson_4.lessoncode;

public class AndOperator {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		// & - and
		// && - and
		boolean firstNumBiggerThanSecond = num1 > num2;
		boolean firstNumBiggerThanThird = num1 > num3;
		boolean firstNumberIsGreater = firstNumBiggerThanSecond && firstNumBiggerThanThird;

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Number 1 bigger than 2 and 3!");
		}

		if (firstNumBiggerThanSecond && firstNumBiggerThanThird) {
			System.out.println("Number 1 bigger than 2 and 3!");
		}

	}

}
