package main.java.JavaGuru_2020_Java1.teacher.lesson_12.lessoncode;

public class ExceptionDemo {

	public void m4() throws AccessDeniedException {
		/*AccessDeniedException exception =
					new AccessDeniedException("Invalid sequrity key", "sequrityKey");
		throw exception;*/

		throw new AccessDeniedException("Invalid sequrity key", "sequrityKey");
	}

}
