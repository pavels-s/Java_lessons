package main.java.student_pavel_sharkel.lesson_4.level_4;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 6, secondNumber = 3, thirdNumber = 9;

        System.out.println("First number = " + firstNumber + "; second number = " + secondNumber + " third number = " + thirdNumber);
        System.out.println("Addition = " + sum(firstNumber, secondNumber));
        System.out.println("Subtraction = " + sub(firstNumber, secondNumber));
        System.out.println("Multiplication = " + mult(firstNumber, secondNumber));
        System.out.println("Division = " + div(firstNumber, secondNumber));
        System.out.println("First number is even: " + isEven(firstNumber));
        System.out.println("Second number is even: " + isEven(secondNumber));
        System.out.println("Max of two numbers is: " + maxOfTwoNumbers(firstNumber, secondNumber));
        System.out.println("Max of three numbers is : " + maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber));

    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double div(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }


    public static int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else if ((thirdNumber >= firstNumber) && (thirdNumber >= secondNumber)) {
            return thirdNumber;
        }
        else {
            return firstNumber;
        }
    }
}
