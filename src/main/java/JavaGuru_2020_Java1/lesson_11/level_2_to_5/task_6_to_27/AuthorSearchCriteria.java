package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        // допишите реализацию метода
        // return true - если автор книги совпадает с this.authorToSearch
        // иначе return false
        if (authorToSearch.equals(book.getAuthor())) {
            return true;
        } else {return false;}
    }

}
