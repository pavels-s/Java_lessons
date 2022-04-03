package main.java.JavaGuru_2020_Java1.lesson_12.level_5;

import java.util.Objects;

class Product {

    // создайте нужные свойства класса
    private String title;
    private Integer price;    // указана в центах
    private String description;

    // создайте конструктор класса
    public Product(String title,
                   Integer price,
                   String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // создайте get() set() методы
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // переопределите методы:
    //      equals()
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    //  Переопределите    hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    //     Переопределите toString()
    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
