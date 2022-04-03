package main.java.JavaGuru_2020_Java1.teacher.lesson_4.lessoncode;

class IfExample {

	public static void main(String[] args) {

		boolean answer = true;
		answer = false;

		/* IF TEMPLATE
		if () {
			// commands - if body
		}
		*/

		if (true) {
			System.out.println("IF is TRUE!");
		}

		if (-1 > 0) {
			System.out.println("IF executed!");
		}

		// <, <=, >, >=, ==, !=

		int number1 = 10;

		if (number1 < 20) {
			System.out.println("Number is less than 20!");
		}

		int number2 = 10;

		if (number1 == number2) {
			System.out.println("Number 1 is equals to number 2");
		}

		number2 = 13132;
		if (number1 != number2) {
			System.out.println("Number 1 is NOT equals to number 2");
			System.out.println("Number 1 is NOT equals to number 2");
			System.out.println("Number 1 is NOT equals to number 2");
			System.out.println("Number 1 is NOT equals to number 2");
		}

		if (number1 != number2)
			System.out.println("Number 1 is NOT equals to number 2");

		System.out.println("Number 1 is NOT equals to number 2");


		if (number1 != number2) {
			System.out.println("Number 1 is NOT equals to number 2");
			System.out.println("Number 1 is NOT equals to number 2");
		}

		System.out.println("Number 1 is NOT equals to number 2");
		System.out.println("Number 1 is NOT equals to number 2");
		System.out.println("Number 1 is NOT equals to number 2");

		// int, long, double, float, boolean - primitivnie tipi dannih

		String text = new String("text");
		// .equals()
		if (text == "text") {

		}


	}

}
