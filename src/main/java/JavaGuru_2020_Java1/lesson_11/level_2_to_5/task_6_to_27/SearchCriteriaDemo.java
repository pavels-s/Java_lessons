package main.java.JavaGuru_2020_Java1.lesson_11.level_2_to_5.task_6_to_27;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria2 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteria3 = new OrSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);
    }
//        Book book1 = new Book("Kuper", "Muhoboi", "1981");
//        Book book2 = new Book("Kuper", "Zveroboi", "1990");
//        Book book3 = new Book("Duper", "Muhoboi", "1980");
//
//        BookDatabase bookDatabase = new BookDatabaseImpl();
//        bookDatabase.save(book1);
//        bookDatabase.save(book2);
//        bookDatabase.save(book3);

}
