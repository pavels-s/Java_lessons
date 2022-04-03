package main.java.JavaGuru_2020_Java1.lesson_12.level_5;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
