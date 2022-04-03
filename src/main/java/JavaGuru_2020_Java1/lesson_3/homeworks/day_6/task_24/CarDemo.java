package main.java.JavaGuru_2020_Java1.lesson_3.homeworks.day_6.task_24;

public class CarDemo {

    public static void main(String[] args) {

        Car bmw = new Car("bmw", 2009);
        Car honda = new Car("honda",2005);

        bmw.engineOn();
        honda.engineOn();

        bmw.engineOff();
        honda.engineOff();

    }
}
