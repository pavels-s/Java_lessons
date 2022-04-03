package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositTest();
        System.out.println();
        creditCardTest.withdrawTest1();
        System.out.println();
        creditCardTest.withdrawTest2();

    }
    public void depositTest() {
        CreditCard creditCard = new CreditCard(1, 0000);

        creditCard.deposit(0000, 12);
        if (creditCard.getBalance() == 212) {
            System.out.println("Deposit test is OK");
        } else {
            System.out.println("Deposit test is FAILED");
        }
    }

    public void withdrawTest1() {
        CreditCard creditCard = new CreditCard(1, 0000);

        creditCard.withdraw(0000, 50);
        if (creditCard.getBalance() == 150) {
            System.out.println("Withdraw test is OK");
        } else {
            System.out.println("Withdraw test is FAILED");
        }
    }

        public void withdrawTest2() {
        CreditCard creditCard = new CreditCard(1, 0000);

        creditCard.withdraw(0000, 500);
        if ((creditCard.getBalance() == 0) && (creditCard.getCreditDebt() == 300)) {
            System.out.println("Withdraw test with loan is OK");
        } else {
            System.out.println("Withdraw test with loan is FAILED");
        }
    }

}
