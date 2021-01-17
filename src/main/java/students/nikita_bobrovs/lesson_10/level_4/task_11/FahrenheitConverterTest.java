package students.nikita_bobrovs.lesson_10.level_4.task_11;

class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverterTest subject = new FahrenheitConverterTest();
        subject.convertTest();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

    void convertTest() {
        System.out.println("Convert to fahrenheit test : " + testResult
                (122 == fahrenheitConverter.convert(50)));
    }
}
