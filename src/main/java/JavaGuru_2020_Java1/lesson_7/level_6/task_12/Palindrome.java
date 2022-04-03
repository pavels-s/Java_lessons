package main.java.JavaGuru_2020_Java1.lesson_7.level_6.task_12;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Palindrome {

    public static boolean isPalindrome(String stroka) {

        stroka = stroka.toUpperCase();
        char[] strChars = stroka.toCharArray();

        List<Character> word = new ArrayList<>();
        for (char c : strChars) {
            word.add(c);
        }

        while (true) {
            if ((word.size() == 1) || (word.size() == 0)) {
                return true;
            }
            if (word.get(0) == word.get(word.size() - 1)) {
                word.remove(0);
                word.remove(word.size() - 1);
            } else {
                return false;

            }

        }
    }
}
