package main.java.student_pavel_sharkel.lesson_9.level_5_6;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
            String traderName = trader.getFullName();
            if (traderName.equals("Pokemon")) {
                return false;
            } else {
                return true;
            }

    }

}
