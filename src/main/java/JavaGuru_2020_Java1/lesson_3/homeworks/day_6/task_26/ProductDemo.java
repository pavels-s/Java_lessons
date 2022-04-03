package main.java.JavaGuru_2020_Java1.lesson_3.homeworks.day_6.task_26;

public class ProductDemo {

    public static void main(String[] args) {

        Product paint = new Product("Vivacolor");

        paint.regularPrice(5);
        paint.actualPrice(15);
        paint.printInformation();
    }
}
