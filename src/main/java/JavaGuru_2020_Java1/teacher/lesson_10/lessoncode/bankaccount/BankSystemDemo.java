package main.java.JavaGuru_2020_Java1.teacher.lesson_10.lessoncode.bankaccount;

public class BankSystemDemo {

	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystemV1();
		BankClient bankClient = new BankClient(bankSystem);
		bankClient.putMoneyToBank();
		bankClient.getMoneyFromBank();

		bankSystem = new BankSystemV2();
		bankClient = new BankClient(bankSystem);
		bankClient.putMoneyToBank();
		bankClient.getMoneyFromBank();
	}

}
