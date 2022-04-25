package main.java.student_pavel_sharkel.lesson_3.homeworks.day_6.task_25;

public class Circle {

    private double radius, pi=3.14, area;

    public Circle(double radius) {

        this.radius = radius;
    }
    double calculateArea() {
        this.area = radius * pi;
        return area;
    }
}
