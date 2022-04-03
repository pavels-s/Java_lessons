package main.java.JavaGuru_2020_Java1.teacher.lesson_8.lessoncode.cars;

abstract class Car {

    protected String model;

    public Car(String model) {
        this.model = model;
    }

    abstract void start();

    abstract void stop();

}
