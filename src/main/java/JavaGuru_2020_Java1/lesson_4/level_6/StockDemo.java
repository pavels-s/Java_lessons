package main.java.JavaGuru_2020_Java1.lesson_4.level_6;

public class StockDemo {

    public static void main(String[] args) {

        Stock bmw = new Stock("Bmw", 10);

        System.out.println(bmw.printInformation());
        bmw.updatePrice(5);
        bmw.updatePrice(23);
        bmw.updatePrice(7);
        System.out.println(bmw.printInformation());
    }
}
