package main.java.teacher.lesson_7.lessoncode.calculator.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Policy {

	private List<InsuranceObject> insuranceObjects;

	public Policy(InsuranceObject ... insuranceObjects) {
		this.insuranceObjects = new ArrayList<>(Arrays.asList(insuranceObjects));
	}

	public List<InsuranceObject> getInsuranceObjects() {
		return insuranceObjects;
	}
}
