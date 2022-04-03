package main.java.JavaGuru_2020_Java1.lesson_9.level_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe(0000, 150);

        safe.putMoney(0000, 15);
        safe.getMoney(0001, 20);
    }
}
