package students.jelena_kaverska.lesson_10.level_7.task_28;

import java.math.BigDecimal;
import java.math.RoundingMode;

enum TemperatureConverter {

    CelsiusToFahrenheit {
        @Override
        double convert(double temperature) {
            return new BigDecimal(1.8 * temperature + 32).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    },

    CelsiusToKelvin {
        @Override
        double convert(double temperature) {
            return new BigDecimal(temperature + 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    },

    FahrenheitToCelsius {
        @Override
        double convert(double temperature) {
            return BigDecimal.valueOf((temperature - 32) * 0.5556).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    },

    FahrenheitToKelvin { //(32°F − 32) × 5/9 + 273.15 = 273.15K
        @Override
        double convert(double temperature) {
            return BigDecimal.valueOf((temperature - 32) * 0.5556 + 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    },

    KelvinToCelsius {
        @Override
        double convert(double temperature) {
            return new BigDecimal(temperature - 273.15).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    },

    KelvinToFahrenheit {
        @Override
        double convert(double temperature) {
            return new BigDecimal(temperature * 1.8 - 459.67).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
    };

    abstract double convert(double temperature);
}