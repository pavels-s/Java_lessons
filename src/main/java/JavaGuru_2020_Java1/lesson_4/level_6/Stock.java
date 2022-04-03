package main.java.JavaGuru_2020_Java1.lesson_4.level_6;

public class Stock {

        private String companyName;
        private int currentPrice;
        private int minPrice;
        private int maxPrice;

        public Stock(String companyName, int currentPrice) {
            this.companyName = companyName;
            this.currentPrice = currentPrice;
            this.minPrice = currentPrice;
            this.maxPrice = currentPrice;
        }

        public void updatePrice(int newPrice) {
            if (newPrice < minPrice) {
                this.minPrice = newPrice;
            }
            if (newPrice > maxPrice) {
                this.maxPrice = newPrice;
            }
            this.currentPrice = newPrice;
        }

        public String printInformation() {
            return "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
        }
    }

