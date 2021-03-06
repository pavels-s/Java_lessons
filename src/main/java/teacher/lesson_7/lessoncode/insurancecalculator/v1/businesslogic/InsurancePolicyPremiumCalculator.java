package main.java.teacher.lesson_7.lessoncode.insurancecalculator.v1.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_7.lessoncode.insurancecalculator.v1.domain.InsuranceObject;
import teacher.lesson_7.lessoncode.insurancecalculator.v1.domain.Policy;

public class InsurancePolicyPremiumCalculator {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator
			= new InsuranceObjectPremiumCalculator();

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal insuranceObjectPremium = insuranceObjectPremiumCalculator.calculate(insuranceObject);
			premium = premium.add(insuranceObjectPremium);
		}
		return premium;
	}

}