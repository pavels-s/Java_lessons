package main.java.student_pavel_sharkel.lesson_7.level_6.task_12;

import main.java.teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Всегда нужны тесты на позитивный и негативный сценарии!")
class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.test1();

    }

    void test1() {
        Palindrome palindrome = new Palindrome();

        if (palindrome.isPalindrome("kUkakuk")) {
            System.out.println("Palindrome test is OK");
        } else {
            System.out.println("Palindrome test is FAILED");
        }
    }
}
