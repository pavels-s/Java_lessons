package main.java.JavaGuru_2020_Java1.lesson_9.level_2.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

@CodeReview(approved = true)
class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

@CodeReview(approved = true)
class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

