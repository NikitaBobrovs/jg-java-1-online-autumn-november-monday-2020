package students.jelena_kaverska.lesson_10.level_7.task_28;

class Converter {
    private TemperatureConverter temperatureConverter;

    public Converter(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    double convertTemperature(double temperature) {
        return temperatureConverter.convert(temperature);
    }
}

class My {

    public static void main(String[] args) {
        Converter converter = new Converter(TemperatureConverter.CelsiusToFahrenheit);
        System.out.println(converter.convertTemperature(10));

        Converter converter1 = new Converter(TemperatureConverter.CelsiusToKelvin);
        System.out.println(converter1.convertTemperature(10));

        Converter converter2 = new Converter(TemperatureConverter.FahrenheitToCelsius);
        System.out.println(converter2.convertTemperature(50));

        Converter converter3 = new Converter(TemperatureConverter.FahrenheitToKelvin);
        System.out.println(converter3.convertTemperature(50));

        Converter converter5 = new Converter(TemperatureConverter.KelvinToCelsius);
        System.out.println(converter5.convertTemperature(273.15));

        Converter converter6 = new Converter(TemperatureConverter.KelvinToFahrenheit);
        System.out.println(converter6.convertTemperature(283.15));
    }
}