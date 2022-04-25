package main.java.student_pavel_sharkel.lesson_8.level_4;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleTest {
    public static void main(String[] args) {

        CircleTest circleTest = new CircleTest();
        circleTest.circleAreaTest();
        circleTest.circlePerimeterTest();

    }

    void circleAreaTest() {
        Circle circle = new Circle(2.0);

        if (circle.calculateArea() == 12.56) {
            System.out.println("Circle area test is OK");
        } else {
            System.out.println("Circle area test is FAILED");
        }
    }

    void circlePerimeterTest() {
        Circle circle = new Circle(2.0);

        if (circle.calculatePerimeter() == 12.56) {
            System.out.println("Circle perimeter test is OK");
        } else {
            System.out.println("Circle perimeter test is FAILED");
        }
    }
}
