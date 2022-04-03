package main.java.JavaGuru_2020_Java1.teacher.lesson_12.lessoncode;

public class AccessDeniedUnchekedException extends RuntimeException {

	private String invalidSequrityKey;

	public AccessDeniedUnchekedException(String message, String invalidSequrityKey) {
		super(message);
		this.invalidSequrityKey = invalidSequrityKey;
	}

	public String getInvalidSequrityKey() {
		return invalidSequrityKey;
	}
}