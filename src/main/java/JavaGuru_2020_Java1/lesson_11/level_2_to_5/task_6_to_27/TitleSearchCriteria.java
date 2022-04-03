package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если название книги совпадает с this.titleToSearch
        // иначе return false
        if (book.getTitle().equals(titleToSearch)) {
            return true;
        } else {return false;}
    }

}
