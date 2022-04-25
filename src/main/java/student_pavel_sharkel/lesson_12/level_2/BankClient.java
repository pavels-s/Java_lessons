package main.java.student_pavel_sharkel.lesson_12.level_2;

public class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств
    BankClient(String uid, String fullName){
        this.uid = uid;
        this.fullName = fullName;
    }

    // создайте get() методы для каждого из свойств

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }
}
