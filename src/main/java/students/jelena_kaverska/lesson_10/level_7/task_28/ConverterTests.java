package students.jelena_kaverska.lesson_10.level_7.task_28;

class ConverterTests {

    private Converter c;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testCelsiusToFahrenheit() {
        double exp = 50;
        c = new Converter(TemperatureConverter.CelsiusToFahrenheit);
        double act = c.convertTemperature(10);
        System.out.println("Test Celsius to Fahrenheit: " + printResults(exp == act));
    }

    void testCelsiusToKelvin() {
        double exp = 283.15;
        c = new Converter(TemperatureConverter.CelsiusToKelvin);
        double act = c.convertTemperature(10);
        System.out.println("Test Celsius to Kelvin: " + printResults(exp == act));
    }

    void testFahrenheitToCelsius() {
        double exp = 10;
        c = new Converter(TemperatureConverter.FahrenheitToCelsius);
        double act = c.convertTemperature(50);
        System.out.println("Test Fahrenheit to Celsius: " + printResults(exp == act));
    }

    void testFahrenheitToKelvin() {
        double exp = 283.15;
        c = new Converter(TemperatureConverter.FahrenheitToKelvin);
        double act = c.convertTemperature(50);
        System.out.println("Test Fahrenheit to Kelvin: " + printResults(exp == act));
    }

    void testKelvinToCelsius() {
        double exp = 0;
        c = new Converter(TemperatureConverter.KelvinToCelsius);
        double act = c.convertTemperature(273.15);
        System.out.println("Test Kelvin to Celsius: " + printResults(exp == act));
    }

    void testKelvinToFahrenheit() {
        double exp = 50;
        c = new Converter(TemperatureConverter.KelvinToFahrenheit);
        double act = c.convertTemperature(283.15);
        System.out.println("Test Kelvin to Fahrenheit: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        ConverterTests tests = new ConverterTests();
        tests.testCelsiusToFahrenheit();
        tests.testCelsiusToKelvin();
        tests.testFahrenheitToCelsius();
        tests.testFahrenheitToKelvin();
        tests.testKelvinToCelsius();
        tests.testKelvinToFahrenheit();
    }
}