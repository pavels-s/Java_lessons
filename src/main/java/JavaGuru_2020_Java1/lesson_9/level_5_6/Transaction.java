package main.java.JavaGuru_2020_Java1.lesson_9.level_5_6;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Trader getTrader() {
        return trader;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
