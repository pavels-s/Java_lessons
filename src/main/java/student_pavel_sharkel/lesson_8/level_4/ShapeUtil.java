package main.java.student_pavel_sharkel.lesson_8.level_4;

import java.util.Random;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {

    Circle createRandomCircle() {
        Circle circle = new Circle(generateRandomDouble());
        return circle;
    }

    Square createRandomSquare() {
        Square square = new Square(generateRandomDouble());
        return square;
    }

    Rectangle createRandomRectangle() {
        Rectangle rectangle = new Rectangle(generateRandomDouble(), generateRandomDouble());
        return rectangle;
    }

    Triangle createRandomTriangle() {
        Triangle triangle = new Triangle(generateRandomDouble(),generateRandomDouble(), generateRandomDouble());
        return triangle;
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }



    double generateRandomDouble() {
        Random random = new Random(10);
        double randomNumber = random.nextDouble();
        return randomNumber;
    }
}
