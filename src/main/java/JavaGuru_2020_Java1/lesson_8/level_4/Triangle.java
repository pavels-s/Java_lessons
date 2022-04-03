package main.java.JavaGuru_2020_Java1.lesson_8.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {

    private double sideA, sideB, sideC, area, perimeter;

    Triangle(double sideA, double sideB, double sideC) {
        super("triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(p * (p-sideA) * (p-sideB) * (p - sideC));
        return Math.floor(100*(area))/100.0f;
    }

    double calculatePerimeter() {
        perimeter = sideA + sideB + sideC;
        return Math.floor(100*(perimeter))/100.0f;
    }
}
