package main.java.student_pavel_sharkel.lesson_3.homeworks.day_6.task_26;

public class Product {

    private String name;
    private double regularPrice, discount, actualPrice;

    public Product(String name) {
        this.name = name;
    }

    public double regularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return regularPrice;
    }

    public double actualPrice(double discount) {
        this.discount = discount;
        actualPrice = regularPrice - (regularPrice / 100 * discount);
        return actualPrice;
    }



    public void printInformation() {
        System.out.println("Product: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Actual price: " + actualPrice);
    }

}
