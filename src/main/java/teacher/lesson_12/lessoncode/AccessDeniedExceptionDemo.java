package main.java.teacher.lesson_12.lessoncode;

public class AccessDeniedExceptionDemo {

	public static void main(String[] args) {
		try {
			m1();
			System.out.println("MAIN Shit happens!");
		} catch (AccessDeniedException e) {
			System.out.println("Error message = " + e.getMessage());
			System.out.println("Invalid key  = " + e.getInvalidSequrityKey());
		}
		System.out.println("MAIN Shit happens AFTER EXCEPTION is CATCED!");
	}

	public static void m1() throws AccessDeniedException {
		m2();
		System.out.println("M1 Shit happens!");
	}

	public static void m2() throws AccessDeniedException {
		ExceptionDemo demo = new ExceptionDemo();
		demo.m4();
		System.out.println("M2 Shit happens!");
	}

}
