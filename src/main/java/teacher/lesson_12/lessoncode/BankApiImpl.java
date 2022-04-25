package main.java.teacher.lesson_12.lessoncode;

import java.util.Optional;

public class BankApiImpl implements BankApi {

	@Override
	public Optional<String> getClientFullName(String sequrityKey,
											  Long clientId)
				throws AccessDeniedException {
		if (sequrityKey == null || !sequrityKey.equals("abcd")) {
			AccessDeniedException exception =
					new AccessDeniedException("Invalid sequrity key", sequrityKey);
			throw exception;
			// throw new AccessDeniedException("Invalid sequrity key", sequrityKey);
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();  // return "";
		}
	}

	public static void main(String[] args) throws AccessDeniedException {
		try {
			BankApiImpl bankApiImpl = new BankApiImpl();
			Optional<String> result = bankApiImpl.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
		} catch (AccessDeniedException exception) {
			System.out.println(exception.getMessage());
			System.out.println(exception.getInvalidSequrityKey());
		} finally {
			System.out.println("Finally");
		}
	}

}
