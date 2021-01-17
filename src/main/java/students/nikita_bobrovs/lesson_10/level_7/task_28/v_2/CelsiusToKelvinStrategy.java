package students.nikita_bobrovs.lesson_10.level_7.task_28.v_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

class CelsiusToKelvinStrategy implements TemperatureConverterStrategy{
    @Override
    public double convert(double temperature) {
        BigDecimal bigDecimal = BigDecimal.valueOf(temperature + 273.15)
                .setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
