package main.java.JavaGuru_2020_Java1.lesson_10.level_3.task_10;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
