package main.java.JavaGuru_2020_Java1.teacher.lesson_10.lessoncode.bankaccount;

public class BankClient {

	private BankSystem bankSystem;

	public BankClient(BankSystem bankSystem) {
		this.bankSystem = bankSystem;
	}

	public void putMoneyToBank() {
		int money = 1000;
		boolean result = bankSystem.putMoney(money);
		System.out.println("Put money result = " + result);
	}

	public void getMoneyFromBank() {
		int money = 1000;
		boolean result = bankSystem.getMoney(money);
		System.out.println("Get money result = " + result);
	}

}
