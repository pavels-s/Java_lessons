package main.java.teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceObject;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceRisk;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.SubInsuranceObject;

public class InsuranceObjectPremiumCalculator {

	private InsuranceRiskCoefficientDetector riskCoefficientDetector;

	public InsuranceObjectPremiumCalculator(InsuranceRiskCoefficientDetector riskCoefficientDetector) {
		this.riskCoefficientDetector = riskCoefficientDetector;
	}

	public BigDecimal calculate(InsuranceObject insuranceObject) {
		Set<InsuranceRisk> subObjectRisks = getAllUniqueRisksForSubObjects(insuranceObject);
		BigDecimal subInsuranceObjectRiskPremium = BigDecimal.ZERO;
		for (InsuranceRisk insuranceRisk : subObjectRisks) {
			BigDecimal subObjectPriceForRisk = calculatePriceSumForSubObjectWithRisk(insuranceObject, insuranceRisk);
			BigDecimal coefficient = riskCoefficientDetector.getCoefficient(insuranceRisk, subObjectPriceForRisk);
			subInsuranceObjectRiskPremium = subInsuranceObjectRiskPremium.add(subObjectPriceForRisk.multiply(coefficient));
		}
		return subInsuranceObjectRiskPremium;
	}

	private BigDecimal calculatePriceSumForSubObjectWithRisk(InsuranceObject insuranceObject,
															 InsuranceRisk insuranceRisk) {
		BigDecimal subObjectPriceForRisk = BigDecimal.ZERO;
		for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjects()) {
			if (subInsuranceObject.getInsuranceRisks().contains(insuranceRisk)) {
				subObjectPriceForRisk = subObjectPriceForRisk.add(subInsuranceObject.getPrice());
			}
		}
		return subObjectPriceForRisk;
	}

	private Set<InsuranceRisk> getAllUniqueRisksForSubObjects(InsuranceObject insuranceObject) {
		Set<InsuranceRisk> subObjectRisks = new HashSet<>();
		for (SubInsuranceObject subInsuranceObject : insuranceObject.getSubInsuranceObjects()) {
			subObjectRisks.addAll(subInsuranceObject.getInsuranceRisks());
		}
		return subObjectRisks;
	}

}
