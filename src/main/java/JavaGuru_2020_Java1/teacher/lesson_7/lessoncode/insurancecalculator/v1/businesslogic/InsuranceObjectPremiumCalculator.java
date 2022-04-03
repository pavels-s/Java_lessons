package main.java.JavaGuru_2020_Java1.teacher.lesson_7.lessoncode.insurancecalculator.v1.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_7.lessoncode.insurancecalculator.v1.domain.InsuranceObject;
import teacher.lesson_7.lessoncode.insurancecalculator.v1.domain.InsuranceRisk;

class InsuranceObjectPremiumCalculator {

	private SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator
			= new SubInsuranceObjectsPremiumCalculator();

	public BigDecimal calculate(InsuranceObject insuranceObject) {
		BigDecimal insuranceObjectRiskPremium = calculatePremiumForInsuranceObjectItself(insuranceObject);
		BigDecimal subInsuranceObjectRiskPremium = subInsuranceObjectsPremiumCalculator.calculate(insuranceObject);
		return insuranceObjectRiskPremium.add(subInsuranceObjectRiskPremium);
	}

	private BigDecimal calculatePremiumForInsuranceObjectItself(InsuranceObject insuranceObject) {
		BigDecimal insuranceObjectRiskPremium = BigDecimal.ZERO;
		for (InsuranceRisk insuranceRisk : insuranceObject.getInsuranceRisks()) {
			// calculate premium for each insurance risk
			BigDecimal premium = calculateInsuranceObjectRiskPremium(insuranceObject, insuranceRisk);
			insuranceObjectRiskPremium = insuranceObjectRiskPremium.add(premium);
		}
		return insuranceObjectRiskPremium;
	}

	private BigDecimal calculateInsuranceObjectRiskPremium(InsuranceObject insuranceObject,
			 InsuranceRisk insuranceRisk) {
		BigDecimal coeficient = insuranceObject.getRiskCoeficient(insuranceRisk);
		return insuranceObject.getCadastralValue().multiply(coeficient);
	}


}
