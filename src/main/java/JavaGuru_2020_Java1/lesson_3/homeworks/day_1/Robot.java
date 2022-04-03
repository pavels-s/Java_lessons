package main.java.JavaGuru_2020_Java1.lesson_3.homeworks.day_1;

public class Robot {

        public void sayHello() {
            System.out.print("Hello! ");
        }

        public Robot() {
        }

        public void sayYourName() {
            System.out.println("My name is " + this.name);
        }

	// свойства класса и конструктор обычно пишут сверху

        private String name;
        public Robot(String robotName) {
            this.name = robotName;

        }
}
