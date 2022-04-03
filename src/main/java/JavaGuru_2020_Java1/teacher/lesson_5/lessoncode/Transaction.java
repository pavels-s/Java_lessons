package main.java.JavaGuru_2020_Java1.teacher.lesson_5.lessoncode;

class Transaction {

	private boolean incoming;

	private int money;

	public Transaction(boolean incoming, int money) {
		this.incoming = incoming;
		this.money = money;
	}

	public boolean isIncoming() {
		return incoming;
	}

	public int getMoney() {
		return money;
	}
}
