package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_4.task_18;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {

        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.sumTest();
        twoDimensionalArrayTest.sumTest2();

    }
    void sumTest () {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] testArray = {{1, 3, 6},
                             {2, 7, 1},
                             {8, 1, 1}};

        if (twoDimensionalArray.arraySum(testArray) == 30) {
            System.out.println("Sum test is OK");
        } else {
            System.out.println("Sum test is FAILED");
        }

    }

    void sumTest2 () {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] testArray = {{11, 3, 6},
                {2, 7, -1},
                {8, 10, 1}};

        if (twoDimensionalArray.arraySum(testArray) == 47) {
            System.out.println("Sum test2 is OK");
        } else {
            System.out.println("Sum test2 is FAILED");
        }

    }

}
