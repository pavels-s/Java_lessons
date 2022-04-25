package main.java.teacher.lesson_10.lessoncode;

public class BrokerSystem {

	public static void main(String[] args) {
		InsurancePolicyCalculator calculator = new InsurancePolicyCalculatorImpl();
		Broker broker = new Broker(calculator);
		broker.run();
	}

}
