package main.java.JavaGuru_2020_Java1.lesson_9.level_5_6;

import java.util.ArrayList;

class TransactionTest {

    public static void main(String[] args) {

        TransactionTest transactionTest = new TransactionTest();
        transactionTest.notPokemonTest();
        transactionTest.isPokemonTest();
        transactionTest.valueTrueTest();
        transactionTest.valueFalseTest();
        transactionTest.cityTrueTest();
        transactionTest.cityFalseTest();
        transactionTest.countryTrueTest();
        transactionTest.countryFalseTest();
        transactionTest.overGermanFalseTest();
        transactionTest.overGermanTrue1Test();
        transactionTest.overGermanTrue2Test();
        System.out.println();
        transactionTest.fraudDetectorTrueTest();
        transactionTest.fraudDetectorFalseTest();

    }

    void notPokemonTest() {
        Trader trader = new Trader("Albert", "Ludza", "Latvija");
        FraudRule rule1 = new FraudRule1("rule1");
        Transaction t = new Transaction(trader, 200);

        if (rule1.isFraud(t)) {
            System.out.println("Not Pokemon test is OK");
        } else {
            System.out.println("Not Pokemon test is FAILED");
        }
    }

    void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Talsi", "Latvija");
        FraudRule rule1 = new FraudRule1("rule1");
        Transaction t = new Transaction(trader, 200);

        if (rule1.isFraud(t)) {
            System.out.println("Is Pokemon test is FAILED");
        } else {
            System.out.println("Is Pokemon test is OK");
        }
    }

    void valueTrueTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        FraudRule rule2 = new FraudRule2("rule2");
        Transaction t = new Transaction(trader, 10);

        if (rule2.isFraud(t)) {
            System.out.println("Value true test is OK");
        } else {
            System.out.println("Value true test is FAILED");
        }
    }

    void valueFalseTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        FraudRule rule2 = new FraudRule2("rule2");
        Transaction t = new Transaction(trader, 1000000);

        if (rule2.isFraud(t)) {
            System.out.println("Value false test is OK");
        } else {
            System.out.println("Value false test is FAILED");
        }
    }

    void cityTrueTest() {
        Trader trader = new Trader("Janis", "Orge", "Latvija");
        FraudRule rule3 = new FraudRule3("rule3");
        Transaction t = new Transaction(trader, 100);

        if (rule3.isFraud(t)) {
            System.out.println("City true test is OK");
        } else {
            System.out.println("City true test is FAILED");
        }
    }

    void cityFalseTest() {
        Trader trader = new Trader("Robert", "Sydney", "Australia");
        FraudRule rule3 = new FraudRule3("rule3");
        Transaction t = new Transaction(trader, 100);

        if (rule3.isFraud(t)) {
            System.out.println("City false test is FAILED");
        } else {
            System.out.println("City false test is OK");
        }
    }

    void countryTrueTest() {
        Trader trader = new Trader("John", "Vilnius", "Lithuania");
        FraudRule rule4 = new FraudRule4("rule4");
        Transaction t = new Transaction(trader, 100);

        if (rule4.isFraud(t)) {
            System.out.println("County true test is OK");
        } else {
            System.out.println("Country true test is FAILED");
        }
    }

    void countryFalseTest() {
        Trader trader = new Trader("Albert", "Kingston", "Jamaica");
        FraudRule rule4 = new FraudRule4("rule4");
        Transaction t = new Transaction(trader, 100);

        if (rule4.isFraud(t)) {
            System.out.println("County false test is FAILED");
        } else {
            System.out.println("Country false test is OK");
        }
    }

    void overGermanFalseTest() {
        Trader trader = new Trader("Tim", "Berlin", "Germany");
        FraudRule rule5 = new FraudRule5("rule5");
        Transaction t = new Transaction(trader, 5000);

        if (rule5.isFraud(t)) {
            System.out.println("German transactions over 1000 false test is FAILED");
        } else {
            System.out.println("German transactions over 1000 false test is OK");
        }
    }

    void overGermanTrue1Test() {
        Trader trader = new Trader("Nel", "Hamburd", "Germany");
        FraudRule rule5 = new FraudRule5("rule5");
        Transaction t = new Transaction(trader, 500);

        if (rule5.isFraud(t)) {
            System.out.println("German transactions over 1000 true1 test is OK");
        } else {
            System.out.println("German transactions over 1000 true1 test is FAILED");
        }
    }

    void overGermanTrue2Test() {
        Trader trader = new Trader("Ted", "Liverpool", "Great Britain");
        FraudRule rule5 = new FraudRule5("rule5");
        Transaction t = new Transaction(trader, 5000);

        if (rule5.isFraud(t)) {
            System.out.println("German transactions over 1000 true1 test is OK");
        } else {
            System.out.println("German transactions over 1000 true1 test is FAILED");
        }
    }

    void fraudDetectorTrueTest() {
        Trader trader = new Trader("Tim","Kanzas","China");
        FraudRule rule1 = new FraudRule1("rule1");
        FraudRule rule2 = new FraudRule1("rule2");
        FraudRule rule3 = new FraudRule1("rule3");
        FraudRule rule4 = new FraudRule1("rule4");
        FraudRule rule5 = new FraudRule1("rule5");

        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(rule1);
        fraudRules.add(rule2);
        fraudRules.add(rule3);
        fraudRules.add(rule4);
        fraudRules.add(rule5);

        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        if (fraudDetector.isFraud(t) == null) {
            System.out.println("Fraud detector true test is FAILED");
        } else {
            System.out.println("Fraud detector true test is OK");
        }

    }

    void fraudDetectorFalseTest() {
        Trader trader = new Trader("Pokemon","Kanzas","China");
        FraudRule rule1 = new FraudRule1("rule1");
        FraudRule rule2 = new FraudRule1("rule2");
        FraudRule rule3 = new FraudRule1("rule3");
        FraudRule rule4 = new FraudRule1("rule4");
        FraudRule rule5 = new FraudRule1("rule5");

        ArrayList<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(rule1);
        fraudRules.add(rule2);
        fraudRules.add(rule3);
        fraudRules.add(rule4);
        fraudRules.add(rule5);

        Transaction t = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector(fraudRules);

        if (fraudDetector.isFraud(t) == null) {
            System.out.println("Fraud detector false test is FAILED");
        } else {
            System.out.println("Fraud detector false test is OK");
        }

    }

}
