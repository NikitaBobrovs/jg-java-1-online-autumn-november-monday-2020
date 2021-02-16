package students.jana_sergejenko.lesson_10.level_4;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature*1.8 + 32;
    }
}