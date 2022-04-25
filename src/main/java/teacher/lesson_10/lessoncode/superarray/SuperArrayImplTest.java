package main.java.teacher.lesson_10.lessoncode.superarray;

public class SuperArrayImplTest {

	public static void main(String[] args) {
		SuperArrayImplTest test = new SuperArrayImplTest();
		test.addTest();
		test.getTest();
		test.removeTest();
	}

	public void addTest() {
		SuperIntArray array = new SuperIntArrayImpl();
		array.add(1);
		array.add(2);
		array.add(3);
		int size = array.size();
		if (size == 3) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

	public void getTest() {
		SuperIntArray array = new SuperIntArrayImpl();
		array.add(1);
		array.add(2);
		array.add(7);
		int size = array.get(2);
		if (size == 7) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

	public void removeTest() {
		SuperIntArray array = new SuperIntArrayImpl();
		array.add(1);
		array.add(2);
		array.add(3);
		array.removeByIndex(0);
		array.removeByIndex(0);
		array.removeByIndex(0);
		if (array.size() == 0) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

}
