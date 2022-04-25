package main.java.student_pavel_sharkel.lesson_7.level_6.task_10;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powerTest();
        powerCalculatorTest.powerTest2();

    }
        void powerTest() {
            PowerCalculator powerCalculator = new PowerCalculator();

            if (powerCalculator.intoPower(4, 3) == 64) {
                System.out.println("PowerCalculator 4^3 test is OK");
            } else {
                System.out.println("PowerCalculator 4^3 test is FAILED");
            }
        }

    void powerTest2() {
        PowerCalculator powerCalculator = new PowerCalculator();

        if (powerCalculator.intoPower(3, 5) == 243) {
            System.out.println("PowerCalculator 3^5 test is OK");
        } else {
            System.out.println("PowerCalculator 3^5 test is FAILED");
        }
    }

}
