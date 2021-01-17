package students.nikita_bobrovs.lesson_10.level_7.task_28;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();
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
                (122 == new CelsiusToFahrenheitConverter().convert(50)));
    }

    void celsiusToKelvinTest() {
        System.out.println("From celsius to kelvin test : " + testResults
                (323.15 == new CelsiusToKelvinConverter().convert(50)));
    }

    void fahrenheitToCelsiusConverterTest() {
        System.out.println("From fahrenheit to celsius test : " + testResults
                (4.44 == new FahrenheitToCelsiusConverter().convert(40)));
    }

    void fahrenheitToKelvinConverterTest() {
        System.out.println("From fahrenheit to kelvin test : " + testResults
                (272.04 == new FahrenheitToKelvinConverter().convert(30)));
    }

    void kelvinToCelsiusConverter() {
        System.out.println("From kelvin to celsius test : " + testResults
                (-253.15 == new KelvinToCelsiusConverter().convert(20)));
    }

    void kelvinToFahrenheitConverter() {
        System.out.println("From kelvin to fahrenheit test : " + testResults
                (-441.67 == new KelvinToFahrenheitConverter().convert(10)));
    }
}
