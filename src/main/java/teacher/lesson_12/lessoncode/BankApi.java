package main.java.teacher.lesson_12.lessoncode;

import java.util.Optional;

public interface BankApi {

	Optional<String> getClientFullName(String sequrityKey,
									   Long clientId)
			throws AccessDeniedException;

}
