package main.java.JavaGuru_2020_Java1.lesson_8.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private double sideA, sideB, area, perimeter;

    Rectangle(double sideA, double sideB) {
        super("rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea() {
        area = sideB * sideA;
        return Math.floor(100*(area))/100.0f;
    }

    double calculatePerimeter() {
        perimeter = (sideA * 2) + (sideB * 2);
        return Math.floor(100*(perimeter))/100.0f;
    }
}
