package students.nikita_bobrovs.lesson_7.level_5.task_9;

class PowerCalculator {
    int calculate(int number, int exponent) {
        if (exponent == 0) {
            return 0;
        } else
            return positivePowerResult(number, exponent);
    }

    int positivePowerResult(int number, int exponent) {
        int result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
        }
        return result;
    }
}
