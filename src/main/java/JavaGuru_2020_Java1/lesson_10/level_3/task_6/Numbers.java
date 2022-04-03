package main.java.JavaGuru_2020_Java1.lesson_10.level_3.task_6;

import java.util.function.Predicate;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Numbers implements NumberChecking{

    @Override
    public boolean isNumberBiggerThanTen(int number) {
        Predicate<Integer> predicate = x -> (x > 10);
        return predicate.test(number);
    }

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        int number1 = 4;
        System.out.print(number1 + " > 10? " + numbers.isNumberBiggerThanTen(number1));

        System.out.println();
        int number2 = 14;
        System.out.print(number2 + " > 10? " + numbers.isNumberBiggerThanTen(number2));

    }
}
