package main.java.JavaGuru_2020_Java1.teacher.lesson_7.lessoncode.insurancecalculator.v2.tests;

import java.math.BigDecimal;

import teacher.lesson_7.lessoncode.insurancecalculator.v2.businesslogic.InsurancePolicyPremiumCalculator;
import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.InsuranceObject;
import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.InsuranceObjectType;
import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.InsuranceRisk;
import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.Policy;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
		house.addInsuranceRisk(InsuranceRisk.FIRE);

		Policy policy = new Policy();
		policy.addInsuranceObject(house);

		BigDecimal premium = insurancePolicyPremiumCalculator.calculate(policy);
		if (premium.compareTo(new BigDecimal("5000.00")) == 0) {
			System.out.println("OK!");
		} else {
			System.out.println("FAIL!");
		}
	}

}
