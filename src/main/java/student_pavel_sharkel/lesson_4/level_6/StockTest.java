package main.java.student_pavel_sharkel.lesson_4.level_6;


public class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.test1();
        stockTest.test2();
    }
        public void test1() {
            Stock test1 = new Stock("test1", 10);
            if (test1.printInformation().equals("Company = test1, Current Price = 10, Min Price = 10, Max Price = 10")) {
                System.out.println("Test 1 is OK");
            } else {
                System.out.println("Test 1 is FAILED");
            }
        }

        public void test2() {
            Stock test2 = new Stock("test2", 15);
            test2.updatePrice(55);
            test2.updatePrice(3);
            test2.updatePrice(7);
            if (test2.printInformation().equals("Company = test2, Current Price = 7, Min Price = 3, Max Price = 55")) {
                System.out.println("Test 2 is OK");
            } else {
                System.out.println("Test 2 is FAILED");
            }
        }

}
