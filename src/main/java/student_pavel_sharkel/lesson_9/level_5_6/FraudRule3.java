package main.java.student_pavel_sharkel.lesson_9.level_5_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderCity = trader.getCity();

        if (traderCity.equals("Sydney")) {
            return false;
        } else {
            return true;
        }
    }

}
