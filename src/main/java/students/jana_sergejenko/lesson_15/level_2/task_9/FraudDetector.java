package students.jana_sergejenko.lesson_15.level_2.task_9;

import students.jana_sergejenko.lesson_9.level_5.task_22.Trader;

public class FraudDetector {

    boolean isFraud(Trader trader) {
        return (isFraudName(trader)) ||
                (isFraudCity(trader));
    }

    boolean isFraudName(Trader trader) {
        return (trader.getfullName().equals("Pokemon"));
    }

    boolean isFraudCity(Trader trader) {
        return (trader.getcity().equals("Sidney"));
    }
}
