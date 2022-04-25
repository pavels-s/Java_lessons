package main.java.student_pavel_sharkel.lesson_9.level_1.task_5;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {

    private int password;
    private int moneyAmount, cash;

    public Safe(int password, int moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }


    public void putMoney(int password, int cash) {
        if (password == getPassword()) {
            moneyAmount = moneyAmount + cash;
            System.out.println("In safe we have: " + moneyAmount);
        } else {
            System.out.println("Incorrect password");
        }
    }

    public void getMoney(int password, int cash) {
        if (password == getPassword()) {
            if (getMoneyAmount() >= cash) {
                moneyAmount = moneyAmount - cash;
                System.out.println("In safe we have: " + moneyAmount);
            } else {
                System.out.println("Not enough money");
            }
        } else {
            System.out.println("Incorrect password");
        }
    }

    public int getPassword() {
        return password;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
