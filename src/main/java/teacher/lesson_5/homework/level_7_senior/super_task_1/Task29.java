package main.java.teacher.lesson_5.homework.level_7_senior.super_task_1;

public class Task29 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		arrayUtil.printEvenNumbersOfArray(array);
	}

}
