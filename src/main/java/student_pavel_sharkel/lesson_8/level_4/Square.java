package main.java.student_pavel_sharkel.lesson_8.level_4;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Square extends Shape{

    private double side, area, perimeter;

    Square(double side) {
        super("square");
        this.side = side;
    }

    double calculateArea() {
        area = Math.floor(100*(side * side))/100.0f;
        return area;
    }

    double calculatePerimeter() {
        perimeter = Math.floor(100*(side * 4))/100.0f;
        return perimeter;
    }
}
