package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_3;

public class ArrayUtil {

    int[] arr = {4, 7, 1, 9, 7, 18, 22, 7};
    boolean result;


    Boolean arrayCheck(int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    int arrayCount(int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == number) {
               count++;
           }
        }
        return count;
    }

    void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    void flip(int[] arr) {
        this.arr = arr;
        int sortedArr[] = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            sortedArr[(arr.length-1) - i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArr[i];
        }
    }

    public void sort(int[] arr) {
        this.arr = arr;

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }


}
