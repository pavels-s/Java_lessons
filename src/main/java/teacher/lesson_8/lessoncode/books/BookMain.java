package main.java.teacher.lesson_8.lessoncode.books;

class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("test");
        if (book1.equals(book2)) {
            System.out.println("EQ");
        } else {
            System.out.println("NOT EQ");
        }
    }
}
