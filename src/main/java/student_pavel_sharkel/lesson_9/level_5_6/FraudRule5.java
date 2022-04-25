package main.java.student_pavel_sharkel.lesson_9.level_5_6;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderCountry = trader.getCountry();
        int transactionValue = t.getAmount();

        if (traderCountry.equals("Germany") && (transactionValue > 1000)) {
            return false;
        } else {
            return true;
        }
    }
}
