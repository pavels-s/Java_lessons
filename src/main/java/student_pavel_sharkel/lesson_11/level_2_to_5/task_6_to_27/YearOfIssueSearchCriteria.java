package main.java.student_pavel_sharkel.lesson_11.level_2_to_5.task_6_to_27;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если год выпуска книги совпадает с this.yearOfIssueToSearch
        // иначе return false
        // добавьте в класс Book новое свойство - yearOfIssue - год выпуска
        if (book.getYearOfIssue().equals(yearOfIssueToSearch)){
            return true;
        } else return false;
    }

}
