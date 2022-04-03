package main.java.JavaGuru_2020_Java1.teacher.lesson_6.lessoncode;

public class ArrayUtilTest {

	public static void main(String[] args) {
		ArrayUtilTest test = new ArrayUtilTest();
		test.testCreateArray();
		test.testConvertArrayToString();
	}

	public void testCreateArray() {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.createArray(5);
		if (array.length == 5) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

	public void testConvertArrayToString() {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = {1, 2, 3};
		String str = arrayUtil.convertArrayToString(array);
		if (str.equals("{1,2,3}")) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

}
