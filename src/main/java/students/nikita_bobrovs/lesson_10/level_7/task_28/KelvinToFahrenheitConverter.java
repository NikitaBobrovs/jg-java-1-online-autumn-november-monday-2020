package students.nikita_bobrovs.lesson_10.level_7.task_28;

import java.math.BigDecimal;
import java.math.RoundingMode;

class KelvinToFahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double temperature) {
        BigDecimal bigDecimal = BigDecimal.valueOf(temperature * 9 / 5 - 459.67)
                .setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
