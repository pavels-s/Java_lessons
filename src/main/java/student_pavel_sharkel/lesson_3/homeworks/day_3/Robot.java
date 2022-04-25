package main.java.student_pavel_sharkel.lesson_3.homeworks.day_3;

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
