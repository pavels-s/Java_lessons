package main.java.student_pavel_sharkel.lesson_10.level_3.task_8;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
