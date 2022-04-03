package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class CreditCard {

    private int number;
    private int pin;
    private int balance;
    private int creditLimit;
    private int creditDebt;

    CreditCard(int number, int pin) {
        this.number = number;
        this.pin = pin;
        balance = 200;
        creditDebt = 0;
        creditLimit = 500;
    }

    void setBalance(int balance) {this.balance = balance;}

    void setCreditLimit(int creditLimit) {this.creditLimit = creditLimit;}

    void setCreditDebt(int creditDebt) {this.creditDebt = creditDebt;}

    int getBalance() {return balance;}

    int getCreditLimit() {return creditLimit;}

    int getCreditDebt() {return creditDebt;}

    int getPin() {return pin;}

    int getNumber() {return number;}

    boolean ifPinIsOk(int pin) {return getPin() == pin;}

    boolean ifCreditLimitIsOk() {return getCreditLimit() > getCreditDebt();}

	@CodeReviewComment(teacher = "Можно было сделать, чтобы метод возвращал boolean для интикации выполнилась операция успешно или нет.")
    public void withdraw(int pin, int withdrawValue) {
        if (!ifPinIsOk(pin) || !ifCreditLimitIsOk()) {
            System.out.println("Withdraw refused");
        } else {
            if ((getBalance() < withdrawValue) && ((getBalance() + getCreditDebt()) < withdrawValue)) {
                setCreditDebt(getCreditDebt() + (withdrawValue - getBalance()));
                setBalance(0);
                System.out.println("Withdraw done.");
                System.out.println("Your balance = " + getBalance() + ". Your loan debt = " + getCreditDebt());
            } else {
                setBalance(getBalance() - withdrawValue);
                System.out.println("Your balance = " + getBalance());
            }
        }
    }

	@CodeReviewComment(teacher = "Можно было сделать, чтобы метод возвращал boolean для интикации выполнилась операция успешно или нет.")
    public void deposit(int pin, int depositValue) {
        if (!ifPinIsOk(pin)) {
            System.out.println("Pin is incorrect");
        } else {
            if (getCreditDebt() == 0) {
                setBalance(getBalance() + depositValue);
                System.out.println("Your balance is: " + getBalance());
            } else {
                setBalance(getBalance() + (depositValue - getCreditDebt()));
            }
        }
    }

}
