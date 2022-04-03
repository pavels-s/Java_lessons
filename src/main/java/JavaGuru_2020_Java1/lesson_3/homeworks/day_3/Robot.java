package main.java.JavaGuru_2020_Java1.lesson_3.homeworks.day_3;

public class Robot {

        public void sayHello() {
            System.out.print("Hello! ");
        }

        public Robot() {
        }

        public void sayYourName() {
            System.out.println("My name is " + this.name);
        }

        private String name;
        public Robot(String robotName) {
            this.name = robotName;

        }
}
