package main.java.JavaGuru_2020_Java1.teacher.lesson_9.lessoncode;

public class ElectricCar extends Car {

	public ElectricCar(boolean isSwithedOn, double fuel) {
		super(isSwithedOn, fuel);
	}

	public void start() {
		this.isSwithedOn = true;
	}

}
