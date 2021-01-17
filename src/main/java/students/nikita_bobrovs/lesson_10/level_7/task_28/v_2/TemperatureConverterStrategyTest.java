package students.nikita_bobrovs.lesson_10.level_7.task_28.v_2;

class TemperatureConverterStrategyTest {
    public static void main(String[] args) {
        TemperatureConverterStrategyTest temperatureConverterTest = new TemperatureConverterStrategyTest();
        temperatureConverterTest.celsiusToFahrenheitTest();
        temperatureConverterTest.celsiusToKelvinTest();
        temperatureConverterTest.fahrenheitToCelsiusConverterTest();
        temperatureConverterTest.fahrenheitToKelvinConverterTest();
        temperatureConverterTest.kelvinToCelsiusConverter();
        temperatureConverterTest.kelvinToFahrenheitConverter();
    }

    private String testResults(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    void celsiusToFahrenheitTest() {
        System.out.println("From celsius to fahrenheit test : " + testResults
                (122 == TemperatureConverterStrategy.Strategies.CELSIUS_TO_FAHRENHEIT.convert(50)));
    }

    void celsiusToKelvinTest() {
        System.out.println("From celsius to kelvin test : " + testResults
                (323.15 == TemperatureConverterStrategy.Strategies.CELSIUS_TO_KELVIN.convert(50)));
    }

    void fahrenheitToCelsiusConverterTest() {
        System.out.println("From fahrenheit to celsius test : " + testResults
                (4.44 == TemperatureConverterStrategy.Strategies.FAHRENHEIT_TO_CELSIUS.convert(40)));
    }

    void fahrenheitToKelvinConverterTest() {
        System.out.println("From fahrenheit to kelvin test : " + testResults
                (272.04 == TemperatureConverterStrategy.Strategies.FAHRENHEIT_TO_KELVIN.convert(30)));
    }

    void kelvinToCelsiusConverter() {
        System.out.println("From kelvin to celsius test : " + testResults
                (-253.15 == TemperatureConverterStrategy.Strategies.KELVIN_TO_CELSIUS.convert(20)));
    }

    void kelvinToFahrenheitConverter() {
        System.out.println("From kelvin to fahrenheit test : " + testResults
                (-441.67 == TemperatureConverterStrategy.Strategies.KELVIN_TO_FAHRENHEIT.convert(10)));
    }
}
