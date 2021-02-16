package students.viktors_cesnokovs.lesson_10.level_4.task_11;

class CelsiusConverterTest {
    public static void main(String[] args) {
        CelsiusConverterTest test = new CelsiusConverterTest();
        test.convert();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    CelsiusConverter celsiusConverter = new CelsiusConverter();

    void convert() {
        System.out.println("Convert to celsius : " + result
                (20 == celsiusConverter.convert(20)));
    }
}
