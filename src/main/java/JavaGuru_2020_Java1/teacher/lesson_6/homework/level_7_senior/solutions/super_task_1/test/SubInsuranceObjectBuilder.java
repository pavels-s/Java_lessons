package main.java.JavaGuru_2020_Java1.teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceRisk;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.SubInsuranceObject;

public class SubInsuranceObjectBuilder {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks = new ArrayList<>();

	public static SubInsuranceObjectBuilder createSubInsuranceObject() {
		return new SubInsuranceObjectBuilder();
	}

	private SubInsuranceObjectBuilder() {

	}

	public SubInsuranceObject build() {
		SubInsuranceObject subInsuranceObject = new SubInsuranceObject(name, price);
		insuranceRisks.forEach(insuranceRisk -> subInsuranceObject.addInsuranceRisk(insuranceRisk));
		return subInsuranceObject;
	}

	public SubInsuranceObjectBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public SubInsuranceObjectBuilder withPrice(BigDecimal price) {
		this.price = price;
		return this;
	}

	public SubInsuranceObjectBuilder withRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
		return this;
	}

}
