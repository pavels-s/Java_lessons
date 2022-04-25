package main.java.student_pavel_sharkel.lesson_10.level_3.task_10;

import java.util.Optional;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
