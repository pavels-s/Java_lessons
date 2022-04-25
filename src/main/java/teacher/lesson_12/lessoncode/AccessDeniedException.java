package main.java.teacher.lesson_12.lessoncode;

public class AccessDeniedException extends RuntimeException {

	private String invalidSequrityKey;

	public AccessDeniedException(String message, String invalidSequrityKey) {
		super(message);
		this.invalidSequrityKey = invalidSequrityKey;
	}

	public String getInvalidSequrityKey() {
		return invalidSequrityKey;
	}
}
