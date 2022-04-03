package main.java.JavaGuru_2020_Java1.teacher.lesson_9.lessoncode;

public class WalletDemo {

	public static void main(String[] args) {

		//Wallet wallet1 = new Wallet("123");


		Wallet wallet = new Wallet(100, "123");

		// wallet.money = 0;

		int money = wallet.getMoney("123", 100);


	}

}
