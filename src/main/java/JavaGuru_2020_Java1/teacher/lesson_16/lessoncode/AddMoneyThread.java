package main.java.JavaGuru_2020_Java1.teacher.lesson_16.lessoncode;

public class AddMoneyThread implements Runnable {

	private BankAccount bankAccount;

	public AddMoneyThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			bankAccount.add(1);
		}
	}
}
