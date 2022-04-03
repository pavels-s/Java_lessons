package main.java.JavaGuru_2020_Java1.lesson_9.level_2.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Student extends Person {

    private int course;


    protected Student(int age, String name, int course) {
        super(age, name);
        this.course = course;
    }
}
