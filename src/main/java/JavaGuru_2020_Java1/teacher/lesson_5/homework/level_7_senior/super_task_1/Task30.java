package main.java.JavaGuru_2020_Java1.teacher.lesson_5.homework.level_7_senior.super_task_1;

public class Task30 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		arrayUtil.printOddNumbersOfArray(array);
	}

}
