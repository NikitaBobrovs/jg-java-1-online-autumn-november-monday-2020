package students.viktors_cesnokovs.lesson_10.level_4.task_11;

class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.convert();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

    void convert() {
        System.out.println("Convert to fahrenheit : " + result
                (86 == fahrenheitConverter.convert(30)));
    }
}
