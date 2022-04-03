package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_13;

import java.util.ArrayList;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class Copy {

	@CodeReviewComment(teacher = "Сигнатуру метода менять нельзя! int[] copyInRange(int[] in, int numberFrom, int numberTo)")
    ArrayList<Integer> copyInRange(int[] in, int numberFrom, int numberTo) {
        ArrayList<Integer> selectedArray = new ArrayList<>(in.length);

        for (int i = 0; i < in.length; i++) {
            if ((in[i] > numberFrom) && (in[i] < numberTo)) {
                selectedArray.add(in[i]);

            }
        }
        return selectedArray;
    }
}
