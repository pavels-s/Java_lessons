package main.java.JavaGuru_2020_Java1.teacher.lesson_13.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public double calculate(double income) {
		return income * 0.25;
	}

}
