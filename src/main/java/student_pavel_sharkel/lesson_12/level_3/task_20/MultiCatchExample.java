package main.java.student_pavel_sharkel.lesson_12.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Division by zero"); //Exception уже переъватывает эту ошибку
        }
    }
}
