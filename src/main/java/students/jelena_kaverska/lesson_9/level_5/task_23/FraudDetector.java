package students.jelena_kaverska.lesson_9.level_5.task_23;

import java.util.List;

class FraudDetector {

    List<FraudRule> fraudRules;

    FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}