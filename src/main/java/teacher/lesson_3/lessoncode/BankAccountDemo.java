package main.java.teacher.lesson_3.lessoncode;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor");

        int money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.addMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        money = bankAccount.removeMoney(1000);
        System.out.println("Money = " + money);

        bankAccount.printStatusToConsole();
    }

}
