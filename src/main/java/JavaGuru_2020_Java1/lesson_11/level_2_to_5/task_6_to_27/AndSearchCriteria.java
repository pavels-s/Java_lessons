package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если книга удовлетворяет и левому и правому условию
        // иначе return false
        if (leftCondition.match(book) && rightCondition.match(book)) {
            return true;
        } else return false;
    }

}