package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_13;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
public class CopyTest {
    public static void main(String[] args) {

        CopyTest copyTest = new CopyTest();
        copyTest.test();
    }

    void test() {
        Copy copy = new Copy();
        int[] in = {1, 3, 7, 15};
        ArrayList<Integer> out = new ArrayList<>(2);
        out.add(3);
        out.add(7);

        if (copy.copyInRange(in, 2, 12).equals(out)) {
            System.out.println("Range test is OK");
        } else {
            System.out.println("Range test is FAILED");
        }
    }
}
