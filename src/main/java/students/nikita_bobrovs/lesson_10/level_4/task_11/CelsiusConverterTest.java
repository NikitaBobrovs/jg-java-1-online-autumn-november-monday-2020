package students.nikita_bobrovs.lesson_10.level_4.task_11;

class CelsiusConverterTest {
    public static void main(String[] args) {
        CelsiusConverterTest subject = new CelsiusConverterTest();
        subject.convertTest();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    CelsiusConverter celsiusConverter = new CelsiusConverter();

    void convertTest() {
        System.out.println("Convert to celsius test : " + testResult
                (50 == celsiusConverter.convert(50)));
    }
}
