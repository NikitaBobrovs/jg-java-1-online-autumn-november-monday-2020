package students.jelena_kaverska.lesson_10.level_4.task_11_12;

class TemperatureConverterTests {
    private TemperatureConverter converter;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testKelvinConverter() {
        converter = new KelvinConverter();
        double exp = 283.15;
        double act = converter.convert(10);
        System.out.println("Celsius -> Kelvin test: " + printResults(exp == act));
    }

    void testFahrenheitConverter() {
        converter = new FahrenheitConverter();
        double exp = 68;
        double act = converter.convert(20);
        System.out.println("Celsius -> Fahrenheit test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        TemperatureConverterTests tests = new TemperatureConverterTests();
        tests.testKelvinConverter();
        tests.testFahrenheitConverter();
    }
}