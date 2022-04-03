package main.java.JavaGuru_2020_Java1.lesson_9.level_5_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if ((t.getAmount() > 1000000) || (t.getAmount() <= 0)) {
            return false;
        } else {
            return true;
        }
    }
}
