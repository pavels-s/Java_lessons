package main.java.teacher.lesson_3.lessoncode;

class BankAccount {

    private final String owner;
    private int moneyAmount;

    public BankAccount(String owner) {
        this.owner = owner;
        this.moneyAmount = 0;
    }

    public int addMoney(int moneyToAdd) {
        this.moneyAmount = this.moneyAmount + moneyToAdd;
        return this.moneyAmount;
    }

    public int removeMoney(int moneyToRemove) {
        this.moneyAmount = this.moneyAmount - moneyToRemove;
        return this.moneyAmount;
    }

    public void printStatusToConsole() {
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + moneyAmount);
    }

}
