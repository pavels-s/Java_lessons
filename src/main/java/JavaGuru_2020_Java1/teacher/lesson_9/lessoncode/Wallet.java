package main.java.JavaGuru_2020_Java1.teacher.lesson_9.lessoncode;

class Wallet {

	private int money;
	private String sequrityCode;

	private Wallet(String sequrityCode) {
		if (sequrityCode == null) {
			this.sequrityCode = "123";
		} else {
			this.sequrityCode = sequrityCode;
		}
	}

	public Wallet(int money, String sequrityCode) {
		this(sequrityCode);
		this.money = money;
	}

	public int getMoney(String sequrityCode, int amount) {
		if (isSequirityCodeCorrect(sequrityCode)) {
			money = money - amount;
			return amount;
		} else {
			return 0;
		}
	}

	public void putMoney(String sequrityCode, int amount) {
		if (isSequirityCodeCorrect(sequrityCode)) {
			money = money + amount;
		}
	}

	private boolean isSequirityCodeCorrect(String sequrityCode) {
		return this.sequrityCode.equals(sequrityCode);
	}

}
