package students.viktors_cesnokovs.lesson_10.level_4.task_11;

class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.convert();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    KelvinConverter kelvinConverter = new KelvinConverter();

    void convert() {
        System.out.println("Convert to kelvin : " + result
                (303.15 == kelvinConverter.convert(30)));
    }
}
