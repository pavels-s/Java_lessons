package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_3;


import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {


    ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
    arrayUtilTest.testTrue();
    arrayUtilTest.testFalse();
    arrayUtilTest.testCountTrue();
    arrayUtilTest.testCountFalse();
    arrayUtilTest.testReplace();
    arrayUtilTest.testReplaceAll();
    arrayUtilTest.testFlip();
    arrayUtilTest.testSort();

    }

     public void testTrue() {
        ArrayUtil arrayUtil = new ArrayUtil();
        if (arrayUtil.arrayCheck(4)) {
            System.out.println("Contain test is OK");
        } else {
            System.out.println("Contain test is FAILED");
        }
     }

    public void testFalse() {
        ArrayUtil arrayUtil = new ArrayUtil();
        if (!arrayUtil.arrayCheck(8)) {
            System.out.println("Not contain test is OK");
        } else {
            System.out.println("Not contain test is FAILED");
        }
    }

    public void testCountTrue() {
        ArrayUtil arrayUtil = new ArrayUtil();
        if (arrayUtil.arrayCount(7) == 3) {
            System.out.println("Counting true test is OK");
        } else {
            System.out.println("Counting true test is FAILED");
        }
    }

    public void testCountFalse() {
        ArrayUtil arrayUtil = new ArrayUtil();
        if (arrayUtil.arrayCount(21) == 0) {
            System.out.println("Counting false test is OK");
        } else {
            System.out.println("Counting false test is FAILED");
        }
    }

    public void testReplace() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 4};
        int[] arr2 = {1, 2, 3, 6, 4};
        arrayUtil.replace(arr, 4, 6);

                if (Arrays.equals(arr, arr2)) {
                    System.out.println("Replace test is OK");
                } else {
                    System.out.println("Replace test is FAILED");
                }
    }

    public void testReplaceAll() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 4};
        int[] arr2 = {1, 2, 3, 6, 6};
        arrayUtil.replaceAll(arr, 4, 6);

        if (Arrays.equals(arr, arr2)) {
            System.out.println("Replace all test is OK");
        } else {
            System.out.println("Replace all test is FAILED");
        }
    }

    public void testFlip() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        arrayUtil.flip(arr);

        if (Arrays.equals(arr, arr2)) {
            System.out.println("Flip test is OK");
        } else {
            System.out.println("Flip test is FAILED");
        }
    }

    public void testSort() {
        ArrayUtil arrayutil = new ArrayUtil();
        int[] arr = {2, 5, 1, 4, 3};
        int[] arr2 = {5, 4, 3, 2, 1};

        arrayutil.sort(arr);

        if (Arrays.equals(arr, arr2)) {
            System.out.println("Sort test is OK");
        } else {
            System.out.println("Sort test is FAILED");
        }
    }

}
