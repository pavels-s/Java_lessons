package main.java.student_pavel_sharkel.lesson_12.level_5;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
