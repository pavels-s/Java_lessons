package main.java.JavaGuru_2020_Java1.teacher.lesson_12.lessoncode;

public class BankApiImplClient {

	public static void main(String[] args) {
		BankApi bankApi = new BankApiImpl();
		bankApi.getClientFullName("not valid key", 1l);

		/*try {
			bankApi.getClientFullName("not valid key", 1l);
		} catch (AccessDeniedException exception) {
			//
		}*/

	}

}
