package main.java.JavaGuru_2020_Java1.lesson_5.homeworks.level_5_6;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFIllArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }
        public void shouldCreateArray() {
            ArrayUtil test1 = new ArrayUtil();
            int[] testArray = test1.createArray(5);

            if (testArray.length == 5) {
                System.out.println("Array test is OK");
            } else {
                System.out.println("Array test is FAILED");
            }
        }

        public void shouldFIllArrayWithRandomNumbers() {
            ArrayUtil test2 = new ArrayUtil();
            int[] testArray = test2.createArray(5);
            test2.fillArrayWithRandomNumbers(testArray);

            for (int i = 0; i < testArray.length; i++) {
                if (testArray[i] > 0) {
                    if (i == (testArray.length - 1)) {
                       System.out.println("Random filling test is OK");
                    }
                } else {
                    System.out.println("Random filling test is FAILED");
                }
            }
        }

        public void shouldFindMaxNumber() {
            ArrayUtil test = new ArrayUtil();
            //int[] testArray = test.createArray(4);
            int[] testArray = {2, 7, -1, 3};
            int max = test.findMaxNumber(testArray);

            if (max == 7) {
                System.out.println("Max test is OK");
            } else {
                System.out.println("Max test is FAILED");
            }
        }

        public void shouldFindMinNumber() {
            ArrayUtil test = new ArrayUtil();
            int[] testArray = {3, 9, -1, 0};
            int min = test.findMinNumber(testArray);

            if (min == -1) {
                System.out.println("Min test is OK");
            } else {
                System.out.println("Min test is FAILED");
            }
        }

}
