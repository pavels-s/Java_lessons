package main.java.JavaGuru_2020_Java1.teacher.lesson_3.lessoncode;

public class PhoneDemo {

	public static void main(String[] args) {

		Phone samsung1 = new Phone();
		Phone samsung2 = new Phone();
		Phone samsung3 = new Phone();

		Phone huawey = new Phone("Huawey P10");
		Phone apple = new Phone("Apple");

		Phone blackIPhone = new Phone("IPhone", "Black");
		Phone blueSamsumg = new Phone("Samsung", "Blue");

		blueSamsumg.switchOn();
		blackIPhone.switchOn();

		blueSamsumg.switchOff();
		blackIPhone.switchOff();

		blueSamsumg.call("777");
		blueSamsumg.call("777");
		blueSamsumg.call("777");

		blueSamsumg.call("888");
		blueSamsumg.call("999");

		blueSamsumg.sendSms("999", "Hello!");
		blueSamsumg.sendSms("999", "I love you!");
	}

}
