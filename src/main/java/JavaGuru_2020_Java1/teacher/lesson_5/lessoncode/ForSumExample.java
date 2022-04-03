package main.java.JavaGuru_2020_Java1.teacher.lesson_5.lessoncode;

class ForSumExample {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			sum = sum + i;
		}

		System.out.println("Sum = " + sum);
	}

}
