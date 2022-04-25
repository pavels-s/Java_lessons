package main.java.student_pavel_sharkel.lesson_3.homeworks.day_5;

public class Dog {

    private String dogName, dogColor;
    private int dogAge;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

       public void voice() {
        System.out.println(dogColor + " " + dogAge + " years old " + dogName + " barks gav-gav!");
        System.out.println(dogColor + " " + dogAge + " years old " + dogName + " barks gav-gav!");
        System.out.println(dogColor + " " + dogAge + " years old " + dogName + " barks gav-gav!");

    }

    public void happyBirthday() {
        this.dogAge = dogAge + 1;
        System.out.println("Happy birthday, " + dogName + "!");
    }




}
