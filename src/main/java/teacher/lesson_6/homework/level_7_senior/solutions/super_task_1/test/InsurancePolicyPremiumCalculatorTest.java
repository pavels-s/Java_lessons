package main.java.teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test;

import static teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test.InsuranceObjectBuilder.createInsuranceObject;
import static teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test.PolicyBuilder.createPolicy;
import static teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test.SubInsuranceObjectBuilder.createSubInsuranceObject;

import java.math.BigDecimal;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic.InsuranceObjectPremiumCalculator;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic.InsurancePolicyPremiumCalculator;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic.InsuranceRiskCoefficientDetector;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceRisk;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.Policy;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator policyPremiumCalculator;

	public InsurancePolicyPremiumCalculatorTest() {
		InsuranceRiskCoefficientDetector riskCoefficientDetector = new InsuranceRiskCoefficientDetector();
		InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator(riskCoefficientDetector);
		policyPremiumCalculator = new InsurancePolicyPremiumCalculator(insuranceObjectPremiumCalculator);
	}

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.shouldReturnCorrectSumForPolicyWithOneInsuranceObject();
		test.shouldReturnCorrectSumForPolicyWithMultipleInsuranceObjects();
	}

	public void shouldReturnCorrectSumForPolicyWithOneInsuranceObject() {
		Policy policy = createPolicy()
			.with(createInsuranceObject()
				.with(createSubInsuranceObject()
						.withName("tv")
						.withPrice(new BigDecimal("500.00"))
						.withRisk(InsuranceRisk.FIRE)
						.build()
				).build()
			).build();
		BigDecimal sum = policyPremiumCalculator.calculate(policy);
		boolean condition = isEquals(sum, new BigDecimal("500.00").multiply(new BigDecimal("0.03")));
		checkResults(condition, "shouldReturnCorrectSumForPolicyWithOneInsuranceObject");
	}

	public void shouldReturnCorrectSumForPolicyWithMultipleInsuranceObjects() {
		Policy policy = createPolicy()
				.with(createInsuranceObject()
						.with(createSubInsuranceObject()
								.withName("tv")
								.withPrice(new BigDecimal("500.00"))
								.withRisk(InsuranceRisk.FIRE)
								.build()
						).build()
				)
				.with(createInsuranceObject()
						.with(createSubInsuranceObject()
								.withName("notebook")
								.withPrice(new BigDecimal("500.00"))
								.withRisk(InsuranceRisk.FIRE)
								.build()
						).build()
				).build();
		BigDecimal sum = policyPremiumCalculator.calculate(policy);
		boolean condition = isEquals(sum, new BigDecimal("1000.00").multiply(new BigDecimal("0.03")));
		checkResults(condition, "shouldReturnCorrectSumForPolicyWithMultipleInsuranceObjects");
	}

	private boolean isEquals(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.compareTo(secondNumber) == 0;
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}
