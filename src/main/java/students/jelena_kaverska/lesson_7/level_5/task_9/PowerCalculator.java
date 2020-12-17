package students.jelena_kaverska.lesson_7.level_5.task_9;

class PowerCalculator {

    public double calculatePower(int number, int power) {
        double result;
        if (power == 0) {
            return 1;
        } else if (power > 0) {
            result = number;
            for (int i = 1; i < power; i++) {
                result *= number;
            }
        } else {
            result = 1 / (double) number;
            for (int i = 1; i < Math.abs(power); i++) {
                result *= 1 / (double) number;
            }
            result = Math.round(result * 10000.0) / 10000.0;
        }
        return result;
    }
}