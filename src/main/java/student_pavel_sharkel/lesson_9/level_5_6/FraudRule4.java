package main.java.student_pavel_sharkel.lesson_9.level_5_6;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderCountry = trader.getCountry();

        if (traderCountry.equals("Jamaica")) {
            return false;
        } else {
            return true;
        }
    }
}
