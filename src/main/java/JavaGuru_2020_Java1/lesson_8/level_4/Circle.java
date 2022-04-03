package main.java.JavaGuru_2020_Java1.lesson_8.level_4;

import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape {

    private double radius, area, perimeter;


    Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    double calculateArea() {
        area = Math.floor(100*(radius * radius * Math.PI))/100.0f;
        return area;
    }

    double calculatePerimeter() {
        perimeter = Math.floor(100*(radius * Math.PI * 2))/100.0f;
        return perimeter;
    }

}
