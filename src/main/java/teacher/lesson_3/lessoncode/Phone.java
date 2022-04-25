package main.java.teacher.lesson_3.lessoncode;

public class Phone {

	// Свойства:
	// - модель (Huawey P10, Samsung Galaxy S3): String
	private String model;

	// - цвет (чёрный, красный, ... ): String
	private String color;


	public Phone () {
		this.model = "Samsung S3";
		this.color = "Red";
	}

	public Phone (String newModel) {
		this.model = newModel;
		this.color = "Red";
	}

	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// Поведение
	// - включаться
	public void switchOn() {
		System.out.println(this.model + " switched on! ....");
		System.out.println(this.model + " switched on! ...");
		System.out.println(this.model + " switched on! ..");
		System.out.println(this.model + " switched on! .");
		System.out.println(this.model + " switched on! DONE!");
	}

	// - выключаться
	public void switchOff() {
		System.out.println(this.model + " switched off! ....");
		System.out.println(this.model + " switched off! ...");
		System.out.println(this.model + " switched off! ..");
		System.out.println(this.model + " switched off! .");
		System.out.println(this.model + " switched off! DONE!");
	}

	// - звонить
	public void call(String phoneNumberToCall) {
		System.out.println(this.model + " call to number " + phoneNumberToCall);
	}

	// - отправить смс
	public void sendSms(String phoneNumber, String smsText) {
		System.out.println(this.model + " send sms with text "
				+ smsText + " to number " + phoneNumber);
	}

}
