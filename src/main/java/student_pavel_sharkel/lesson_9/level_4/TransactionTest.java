package main.java.student_pavel_sharkel.lesson_9.level_4;

class TransactionTest {

    public static void main(String[] args) {

        TransactionTest transactionTest = new TransactionTest();
        transactionTest.isPokemonTest();
        transactionTest.notPokemonTest();
        transactionTest.valueTrueTest();
        transactionTest.valueFalseTest();
        transactionTest.cityTrueTest();
        transactionTest.cityFalseTest();
        transactionTest.countryTrueTest();
        transactionTest.countryFalseTest();
        transactionTest.germanCheckingTest();

    }

    public void notPokemonTest() {
        Trader trader = new Trader("Albert", "Ludza", "Latvija");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Not Pokemon test is OK");
        } else {
            System.out.println("Not Pokemon test is FAILED");
        }
    }

    public void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Talsi", "Latvija");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Is Pokemon test is FAILED");
        } else {
            System.out.println("Is Pokemon test is OK");
        }
    }

    public void valueTrueTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        Transaction transaction = new Transaction(trader, 10);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isValueOk(trader)) {
            System.out.println("Value true test is OK");
        } else {
            System.out.println("Value true test is FAILED");
        }
    }

    public void valueFalseTest() {
        Trader trader = new Trader("TestName", "Jekabpils", "Latvija");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isValueOk(trader)) {
            System.out.println("Value false test is OK");
        } else {
            System.out.println("Value false test is FAILED");
        }
    }

    public void cityTrueTest() {
        Trader trader = new Trader("Janis", "Orge", "Latvija");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCityOk(trader)) {
            System.out.println("City true test is OK");
        } else {
            System.out.println("City true test is FAILED");
        }
    }

    public void cityFalseTest() {
        Trader trader = new Trader("Robert", "Sydney", "Australia");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCityOk(trader)) {
            System.out.println("City false test is FAILED");
        } else {
            System.out.println("City false test is OK");
        }
    }

    public void countryTrueTest() {
        Trader trader = new Trader("John", "Vilnius", "Lithuania");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCountryOk(trader)) {
            System.out.println("County true test is OK");
        } else {
            System.out.println("Country true test is FAILED");
        }
    }

    public void countryFalseTest() {
        Trader trader = new Trader("Albert", "Kingston", "Jamaica");
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isCountryOk(trader)) {
            System.out.println("County false test is FAILED");
        } else {
            System.out.println("Country false test is OK");
        }
    }

    public void germanCheckingTest() {
        Trader trader = new Trader("Tim", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isGermanTransaction(trader,transaction)) {
            System.out.println("German transactions over 1000 test is FAILED");
        } else {
            System.out.println("German transactions over 1000 test is OK");
        }
    }
}
