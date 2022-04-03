package main.java.JavaGuru_2020_Java1.lesson_8.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TriangleTest {
    public static void main(String[] args) {

        TriangleTest triangleTest = new TriangleTest();
        triangleTest.triangleAreaTest();
        triangleTest.trianglePerimeterTest();

    }
    void triangleAreaTest() {
        Triangle triangle = new Triangle(2.00, 3.00, 4.00);

        if (triangle.calculateArea() == 2.90) {
            System.out.println("Triangle area test is OK");
        } else {
            System.out.println("Triangle area test is FAILED");
        }
    }

    void trianglePerimeterTest() {
        Triangle triangle = new Triangle(2.00, 3.00, 4.00);

        if (triangle.calculatePerimeter() == 9.00) {
            System.out.println("Triangle perimeter test is OK");
        } else {
            System.out.println("Triangle perimeter test is FAILED");
        }
    }

}
