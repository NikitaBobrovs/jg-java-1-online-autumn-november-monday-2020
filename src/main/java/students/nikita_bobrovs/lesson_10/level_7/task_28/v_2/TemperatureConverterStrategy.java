package students.nikita_bobrovs.lesson_10.level_7.task_28.v_2;

public interface TemperatureConverterStrategy {
    enum Strategies implements TemperatureConverterStrategy{

        CELSIUS_TO_FAHRENHEIT{
            @Override
            public double convert(double temperature) {
                return new CelsiusToFahrenheitStrategy().convert(temperature);
            }
        },
        CELSIUS_TO_KELVIN{
            @Override
            public double convert(double temperature) {
                return new CelsiusToKelvinStrategy().convert(temperature);
            }
        },
        FAHRENHEIT_TO_CELSIUS{
            @Override
            public double convert(double temperature) {
                return new FahrenheitToCelsiusStrategy().convert(temperature);
            }
        },
        FAHRENHEIT_TO_KELVIN{
            @Override
            public double convert(double temperature) {
                return new FahrenheitToKelvinStrategy().convert(temperature);
            }
        },
        KELVIN_TO_CELSIUS{
            @Override
            public double convert(double temperature) {
                return new KelvinToCelsiusStrategy().convert(temperature);
            }
        },
        KELVIN_TO_FAHRENHEIT{
            @Override
            public double convert(double temperature) {
                return new KelvinToFahrenheitStrategy().convert(temperature);
            }
        }
    }

    double convert(double temperature);
        }

