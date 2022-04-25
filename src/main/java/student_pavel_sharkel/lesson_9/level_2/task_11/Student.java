package main.java.student_pavel_sharkel.lesson_9.level_2.task_11;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Student extends Person {

    private int course;


    protected Student(int age, String name, int course) {
        super(age, name);
        this.course = course;
    }
}
