package main.java.student_pavel_sharkel.lesson_8.level_4;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SquareTest {
    public static void main(String[] args) {

        SquareTest squareTest = new SquareTest();
        squareTest.circleAreaTest();
        squareTest.circlePerimeterTest();

    }

    void circleAreaTest() {
        Square square = new Square(4.0);

        if (square.calculateArea() == 16.00) {
            System.out.println("Square area test is OK");
        } else {
            System.out.println("Square area test is FAILED");
        }
    }

    void circlePerimeterTest() {
        Square square = new Square(4.0);

        if (square.calculatePerimeter() == 16.00) {
            System.out.println("Square perimeter test is OK");
        } else {
            System.out.println("Square perimeter test is FAILED");
        }
    }
}
