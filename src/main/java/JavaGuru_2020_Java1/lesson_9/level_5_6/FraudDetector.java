package main.java.JavaGuru_2020_Java1.lesson_9.level_5_6;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
        }

     FraudDetectionResult isFraud(Transaction t) {
        boolean result = false;
        String fraudName = null;
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(result,fraudName);
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                result = true;
                fraudName = fraudDetectionResult.getRuleName();
            }
        }
         return new FraudDetectionResult(result, fraudName);
     }
    }
