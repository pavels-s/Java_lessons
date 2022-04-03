package main.java.JavaGuru_2020_Java1.lesson_8.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RectangleTest {
    public static void main(String[] args) {

        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.rectangleAreaTest();
        rectangleTest.rectanglePerimeterTest();

    }

    void rectangleAreaTest() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);

        if (rectangle.calculateArea() == 6.00) {
            System.out.println("Rectangle area test is OK");
        } else {
            System.out.println("Rectangle area test is FAILED");
        }
    }

    void rectanglePerimeterTest() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);

        if (rectangle.calculatePerimeter() == 10.00) {
            System.out.println("Circle perimeter test is OK");
        } else {
            System.out.println("Circle perimeter test is FAILED");
        }
    }
}
