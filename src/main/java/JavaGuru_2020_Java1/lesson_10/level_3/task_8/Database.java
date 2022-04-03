package main.java.JavaGuru_2020_Java1.lesson_10.level_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
