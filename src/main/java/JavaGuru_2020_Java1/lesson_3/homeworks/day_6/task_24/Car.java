package main.java.JavaGuru_2020_Java1.lesson_3.homeworks.day_6.task_24;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = "bmw";
        this.year = 2009;
    }

    public void engineOn () {
        System.out.println("Engine starting...");
        System.out.println(model + " engine is started");
        System.out.println();
    }

    public void engineOff() {
        System.out.println("Turning off engine...");
        System.out.println(model + " engine is turned off");
        System.out.println();
    }
}
